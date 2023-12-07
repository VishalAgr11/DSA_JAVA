import java.util.*;

class mergesort{
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
        int mid=start +((end-start)/2);
        recurse(arr,start,mid);//left
        recurse(arr,mid+1,end);//right
        merge(arr,start,end,mid);
    }
    static void merge(int arr[],int start,int end,int mid){
        //end-start+1 --so that we get a tenp array which results after merging the two arrays
        int temp[]=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(k=0,i=start; k<temp.length; i++,k++){
            arr[i]=temp[k];
        }
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