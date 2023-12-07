import java.util.*;

class staircase{
    static boolean staircase(int arr[][],int key){
        int i=0,j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if(key==arr[i][j]){
                System.out.println("Found at (" + i +", " + j +")");
                return true;
            }
            else if(key>arr[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("Key not found");
        return false;
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
        System.out.println("Enter search element: ");
        int src=in.nextInt();
        System.out.println("The array is ");

        for (int i=0; i<nr;i++){
            for(int j=0; j<nc;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(staircase(arr,src));
    }
}