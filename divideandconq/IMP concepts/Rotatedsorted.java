import java.util.*;

class rotatedsorted{
    static int search(int arr[],int start,int end,int key){
        int mid = start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==key ){
            return mid;
        }
        if (arr[mid]>=arr[start]){//on line 1
            if(key<=arr[mid] && key>=arr[start]){
                return search(arr,start,mid,key);//left of l1
            }
            else{
                return search(arr,mid+1,end,key);//right of l1
            }
        }
        else{
            if(key>=arr[mid] && key<=arr[end]){// right of l2
                return search(arr,mid+1,end,key);
            }
            else{
                return search(arr,start,mid-1,key);
            }
        }
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number of elements,and then the array elements, search element");
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        int key=in.nextInt();
        System.out.println(search(arr,0,n-1,key));
        //4,5,6,7,0,1,2
    }
}