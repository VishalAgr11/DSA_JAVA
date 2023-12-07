import java.util.*;

class Quicksort{
    static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void recurse(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int pidx=partition(arr,start,end);
        recurse(arr,start,pidx-1);
        recurse(arr,pidx+1,end);
    }
    static int partition(int[] arr,int start,int end){
        int pivot=arr[end];
        int i=start-1;//smaleer than pivot

        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number of elements,and then the array elements");
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        recurse(arr,0,n-1);
        printarr(arr);
    }
}