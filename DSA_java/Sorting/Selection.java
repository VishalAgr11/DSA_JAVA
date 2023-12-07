import java.util.*;

class Selection{
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=arr[minpos];
        }
    }
    static void sortdes(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int maxpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxpos]){
                    maxpos=j;
                }
                int temp=arr[maxpos];
                arr[maxpos]=arr[i];
                arr[i]=temp;
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
        int arr[]={1,2,3,5,6,1,7,4,8,9,10,11};
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