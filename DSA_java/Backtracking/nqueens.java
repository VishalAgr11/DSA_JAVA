import java.util.*;

class nqueens{
    //static int count=0;
    static boolean issafe(char arr[][],int row,int col){
        for(int i=row-1;i>=0;i--){//up
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<arr.length;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    //static void queens(char arr[][],int row){
    static boolean queens(char arr[][],int row){
        if(row==arr.length){
            printBoard(arr);
            //count++;
            return true;
        }
        
            for(int j=0;j<arr[0].length;j++){
                if(issafe(arr,row,j)){
                    arr[row][j] = 'Q';
                    queens(arr,row+1);
                    return true;
                    //arr[row][j] ='X';
                }
            }
        return false;
    }
    static void printBoard(char arr[][]){
        System.out.println("Solution-----");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='X';
            }
        }
        System.out.println(queens(arr,0));
        //System.out.println("Solution-----"+count);
    }
}