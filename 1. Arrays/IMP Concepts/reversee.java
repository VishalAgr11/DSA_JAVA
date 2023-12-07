import java.util.*;

class reversee{
    static void reversee(int arr[]){
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }

    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number of elemets");
        int n=in.nextInt();

        int arr[] = new int[n];
        System.out.println("enter array elements");
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }

        System.out.println("array is");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        reversee(arr);

        System.out.println("Reveresed array is");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}