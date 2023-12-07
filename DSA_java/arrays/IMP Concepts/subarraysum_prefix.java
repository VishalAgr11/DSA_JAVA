import java.util.*;
class subarraysum_prefix{

    static int subsu(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0] = 0;
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curr=(i==0)?(prefix[j]):(curr+prefix[j]-prefix[i-1]);
                if(curr>max){
                    max=curr;
                }
                curr=0;
            }
        }
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
        System.out.println("Max sum= "+subsu(arr));

    }
}
