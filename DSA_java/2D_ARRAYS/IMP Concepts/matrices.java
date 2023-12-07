import java.util.*;

class matrices{
    static boolean search(int arr[][],int src){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                if(arr[i][j]==src){
                    System.out.println("Found at ("+i+" "+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    static int maxx(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<(arr[0].length);j++){
                max=Math.max(max,arr[i][j]);
            }
        }
        return max;
    }static int minn(int arr[][]){
        int max=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                max=Math.min(max,arr[i][j]);
            }
        }
        return max;
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
        for (int i=0; i<nr;i++){
            for(int j=0; j<nc;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Found -- "+search(arr,5));
        System.out.println("Max is "+maxx(arr));
        System.out.println("Min is "+minn(arr));
    }
}