import java.util.*;

class trappingrainwater{
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int n=arr.length;
        int lmax[]=new int[n];
        int rmax[]=new int[n];

        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=(arr[i]>max)?arr[i]:max;
            lmax[i]=Math.max(arr[i],max);
        }

        max=Integer.MIN_VALUE;
        for(int i=(n-1); i>=0; i--){
            max=(arr[i]>max)?arr[i]:max;
            rmax[i]=Math.max(arr[i],max);
        }

        int wtlevel=0;
        int trapped=0;
        int width=1;
        int total=0;
        for(int i=1; i<n; i++){
            wtlevel= (Math.min(lmax[i],rmax[i]));
            trapped=(wtlevel-arr[i])*width;
            trapped=(trapped>0)?trapped:0;
            total=total+trapped;
        }
        System.out.println(total);
    }
}


    
