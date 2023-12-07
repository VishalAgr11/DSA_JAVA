/*Question 2 :
Print out the sum of the numbers in the second row of the “nums” array.
Example :
Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18 */
import java.util.*;
class Q2{
    static int secondsum(int arr[][]){
        int sum=0;
        for(int j=0; j<arr[0].length;j++){
            sum+=arr[1][j];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int nr=in.nextInt();
        int nc=in.nextInt();
        int arr[][]=new int [nr][nc];
        System.out.println("Enter elements: ");

        for (int i=0; i<nr;i++){
            for(int j=0; j<nc;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Sum = "+secondsum(arr));
    }
}