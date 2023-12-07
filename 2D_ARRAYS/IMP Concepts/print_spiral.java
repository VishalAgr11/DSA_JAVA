import java.util.*;

class print_spiral{
    static void spiral(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int sr=0,er=n-1;
        int sc=0,ec=m-1;

        //sr=start row, er= end row
        //sc=start column, ec=end column
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
                System.out.print(arr[sr][j]+" ");
            }
            for(int i=sr+1;i<=er;i++){
                System.out.print(arr[i][ec]+" ");
            }
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                System.out.print(arr[er][j]+" ");
            }
            for(int i=er-1;i>=sr+1;i--){
                if(ec==sc){
                    break;
                }
                System.out.print(arr[i][sc]+" ");
            }
            System.out.println();
            sc++;
            ec--;
            sr++;
            er--;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int arr[][]=new int [3][4];
        int nr=arr.length;
        int nc=arr[0].length;
        System.out.println(nr+" "+nc);

        for (int i=0; i<nr;i++){
            for(int j=0; j<nc;j++){
                arr[i][j]=in.nextInt();
            }
        }
        spiral(arr);
    }
}