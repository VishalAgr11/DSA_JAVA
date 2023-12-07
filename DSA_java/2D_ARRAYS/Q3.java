/*Question 3 : 
Write a program to Find Transpose of a Matrix.
What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns. 
For a 2x3 matrix,
Matrix
a11 a12 a13
a21 a22 a23
Transposed Matrix
a11 a21
a12 a22
a13 a23 
*/
import java.util.*;
class Q3{
    static void transpose(int arr[][],int trans[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                trans[j][i]=arr[i][j];
            }
        }
    }
    static void prints(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int nr=in.nextInt();
        int nc=in.nextInt();
        int arr[][]=new int [nr][nc];
        int tran[][]=new int [nc][nr];
        System.out.println("Enter elements: ");

        for (int i=0; i<nr;i++){
            for(int j=0; j<nc;j++){
                arr[i][j]=in.nextInt();
            }
        }
        transpose(arr,tran);
        System.out.println("Before transpose : ");
        prints(arr);
        System.out.println("After transpose: ");
        prints(tran);
    }
}