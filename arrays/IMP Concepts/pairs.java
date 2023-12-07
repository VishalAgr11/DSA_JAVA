import java.util.*;

class pairs{
    static int pairs(int arr[]){
        int pp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+" , "+arr[j]+") ; ");
                pp++;
            }
            System.out.println();
        }
        return pp;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number of elemets");
        int n=in.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Number of pairs= "+pairs(arr));
    }
}