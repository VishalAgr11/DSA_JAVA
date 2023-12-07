import java.util.*;

class buysellstocks{
    static int buysell(int arr[]){
        int n=arr.length;
        int maxp=0;
        int bp=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if (arr[i]>bp){
                int profit= arr[i]-bp;
                maxp=Math.max(maxp,profit);
            }
            else{
                bp=arr[i];
            }
        }
        return maxp;
    }
    public static void main(String[] args) {
        // int arr[]={7,1,5,3,6,4};
        int arr[]={7,6,4,3,1};
        System.out.println(buysell(arr));
    }
}