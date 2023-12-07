import java.util.*;
class subarraysum{
    static int subsu(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curr=0;
                for(int k=i;k<=j;k++){
                    curr+=arr[k];
                }
                System.out.println(curr);
                if(curr>max){
                    max=curr;
                }
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
        System.out.println("The sums are-- ");
        System.out.println("Max sum= "+subsu(arr));

    }
}