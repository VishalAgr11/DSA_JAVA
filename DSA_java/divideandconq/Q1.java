/*
Question 1 : Apply Merge sort to sort an array of Strings. (Assume that all the characters in
all the Strings are in lowercase). (EASY)
Sample Input 1 : arr = { "sun", "earth", "mars", "mercury" }
Sample Output 1 : arr = { "earth", "mars", "mercury", "sun"}
*/
import java.util.*;

class Q1{
    static void printarr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void recurse(String arr[],int start, int end){
        if(start>=end){
            return ;
        }
        int mid= start +((end-start)/2);
        recurse(arr, start, mid);
        recurse(arr, mid+1, end);
        merge(arr,start,end,mid);
        //System.out.println("Hi");
    }
    static void merge(String arr[],int start,int end,int mid){
        String temp[]=new String[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=end){
            if(((arr[i]).compareTo(arr[j]))>0){
                temp[k]=arr[j];
                k++;
                j++;
            }
            else{
                temp[k]=arr[i];
                k++;
                i++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(i=start,k=0; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number of elements,and then the array elements");
        int n=in.nextInt();
        in.nextLine();
        String arr[] = new String[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextLine();
        }
        printarr(arr);
        recurse(arr,0,n-1);
        printarr(arr);
    }
}