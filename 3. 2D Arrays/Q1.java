/*
Question 1 : 
Print the number of 7’s that are in the 2d array.
Example :
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2 
*/

import java.util.*;
class Q1{
    static int search7(int arr[][]){
        int flag=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                if(arr[i][j]==7)
                    flag++;
            }
        }
        return flag;
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
        System.out.println("Number of 7s="+search7(arr));
    }
}