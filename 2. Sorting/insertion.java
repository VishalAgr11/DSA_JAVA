import java.util.*;

class insertion{
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    static void sortdes(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prevloc=i-1;
            while(prevloc>=0 && arr[prevloc]<curr){
                arr[prevloc+1]=arr[prevloc];
                prevloc--;
            }
            arr[prevloc+1]=curr;
        }
    }
    static void prints(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,7,8,9,10,3,4,5,6,11};
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