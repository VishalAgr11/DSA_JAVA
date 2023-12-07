import java.util.*;
class subarrsum_kadane{
    static int subsum(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]+curr>=0){
                curr+=arr[i];
            }
            // max=(curr>max)?curr:max;
            maxsum=Math.max(curr,maxsum);
            max=Math.max(arr[i],max);
        }
        maxsum=(maxsum==0)?max:maxsum;
        return max;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number of elemets");
        int n=in.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        System.out.println();
        System.out.println("Max sum= "+subsum(arr));

    }
}
