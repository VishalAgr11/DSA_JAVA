import java.util.*;

class counting{
    static void sort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max=Math.max(max,arr[i]);
        }

        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    static void sortdes(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    static void prints(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,7,8,9,10,3,4,5,6,11};
        System.out.println("before Sorting...");
        prints(arr);
        sort(arr);
        System.out.println("\nafter Sorting...");
        prints(arr);
        System.out.println("\nafter Reverse Sorting...");
        sortdes(arr);
        prints(arr);
    }
}