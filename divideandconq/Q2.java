/*
Question 2 : Given an array nums of size n, return the majority element. (MEDIUM)
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume
that the majority element always exists in the array. 
Sample Input 1 : nums = [3,2,3]
Sample Output 1 : 3
Sample Input 2 : nums = [2,2,1,1,1,2,2]
Sample Output 2 : 2 Constraints (extra Conditions):
● n == nums.length
● 1<=n<=5*104
● -109 <= nums[i] <= 109
*/
import java.util.*;

class Q2{
    static int majority(int arr[],int num, int start,int end){
        int count=0;
        for(int i=start;i<end;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
    static int recurse(int arr[],int n,int start,int end){
        if(n<=1){
            return arr[start];
        }
        int mid=start +((end-start)/2);
        int l=recurse(arr,n/2,start,mid);
        int r=recurse(arr,n/2,mid+1,end);//
        //or dont take n here rather keep base condition at start>=end
        if(l==r){
            return l;
        }
        else{
            int lmaj=majority(arr,l,start,mid);
            int rmaj=majority(arr,r,mid+1,end);

            return lmaj>rmaj?l:r;
        }
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number of elements,and then the array elements");
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        System.out.println(recurse(arr,n,0,n-1));
    }
}