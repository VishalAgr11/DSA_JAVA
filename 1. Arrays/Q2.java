/*Question 2: 
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown
pivot index k (1 <= k < nums.length) such that the resulting array is 
[nums[k],nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For example, 
[0,1,2,4,5,6,7] might be rotated at pivot index 3 andbecome [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the
index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
Output: 4

Example 2:
Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
Output: -1 

Example 3:
Input: nums = [1], target = 0
Output: -1
*/
import java.util.*;

class Q2{
    static int mins(int arr[]){
        int l=0;
        int r=arr.length-1;
        
        while(l<=r){
            int mid=l+((r-l)/2);
            if((mid>0)&&(arr[mid]<arr[mid-1])){
                return mid;
            }
            else if(arr[l]<=arr[mid] && arr[mid]>arr[r]){
                l=mid+1;
            }
            else{//(arr[mid]<arr[right])
                r=mid-1;
            }
        }
        return l;
    }
    static int search(int arr[],int l,int r,int src){//normal binary search
        //Sytstem.out.println(l+" "+r+" ");
        while(l<=r){
            int mid=l+((r-l)/2);
            if(arr[mid]==src){
                return mid;
            }
            else if(arr[mid]>src){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    static int search(int arr[],int src){
        int min =mins(arr);
        if(arr[min]<=src && arr[min-1]>=src){
            return search(arr,min,(arr.length-1),src);
        }
        else{
            return search(arr,0,min,src);
        }
    }
    
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int src=0;
        System.out.println(search(arr,src));
    }
}