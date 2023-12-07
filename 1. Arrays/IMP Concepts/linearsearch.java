import java.util.*;

class linearsearch{

    static int linear(int arr[],int src){
        for(int i=0; i<arr.length; i++){
            if(src==arr[i]){
                System.out.println("Found at  "+(i+1));
                return (i+1);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=in.nextInt();
        int arr[]=new int [n];

        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter search element");
        int src=in.nextInt();

        System.out.println(linear(arr,src)>0?"found":"not found");
    }
}