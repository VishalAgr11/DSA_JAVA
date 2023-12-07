/*
Question 1 : For a given integer array of size N. You have to find all the occurrences
(indices) of a given element (Key) and print them. Use a recursive function to solve this
problem.
Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
Sample Output : 1 5 7 8
*/
import java.util.*;

class Q1{
    static void recurse(int arr[], int i,int key){
        if(i==arr.length){
            return;
        }
        if (arr[i] ==key){
            System.out.print(i+", ");
        }
        recurse(arr,i+1,key);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of elemets");
        int n=in.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter search element");
        int src=in.nextInt();
        recurse(arr,0,src);
    }
}