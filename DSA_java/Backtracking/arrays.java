import java.util.*;

class arrays{
    static void changeArr(int arr[],int i,int val){
        if(i==arr.length){
            printarray(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number of elements,and then the array elements");
        int n=in.nextInt();
        int arr[] = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i]=in.nextInt();
        // }
        printarray(arr);
        changeArr(arr,0,1);
        printarray(arr);
    }
}