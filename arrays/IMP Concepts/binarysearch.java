import java.util.*;

class binarysearch{
    //recursion
    static int searchbin(int arr[],int src,int l,int h){
        if(l>h)
        return -1;
        int mid=(l+h)/2;
        if (arr[mid]==src){
            return mid;
        }
        
        else if (src>arr[mid]){
            return searchbin(arr,src,mid+1,h);
        }
        else{
            return searchbin(arr,src,l,mid+1);
        }
    }
    // looping
    static int searchbin(int arr[],int src){
        int h=(arr.length)-1;
        int l=0;

        while (l<=h){
            int mid=(l+h)/2;
            if (arr[mid]==src){
                return mid;
            }
            else if (src<arr[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number of elemets");
        int n=in.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter search element");
        int src=in.nextInt();

        Arrays.sort(arr);

        int loc = (searchbin(arr,src,0,n-1));
        System.out.println((loc>=0)?"found at "+ loc+" in sorted array":"not found ");

        int loc2 = (searchbin(arr,src));
        System.out.println((loc2>=0)?"found at "+ loc2+" in sorted array":"not found ");

    }
}