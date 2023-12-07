import java.util.*;

class bubble{
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++){
            int swaps=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0){
                break;
            }
        }
    }
    static void sortdes(int arr[]){
        for(int i=0;i<(arr.length-1);i++){
            int swaps=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void prints(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("before Sorting...");
        prints(arr);
        sort(arr);
        System.out.println("\nafter Sorting...");
        prints(arr);
        System.out.println("\nafter Reverse Sorting...");
        sortdes(arr);
        prints(arr);
    }
}