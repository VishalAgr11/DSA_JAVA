/*
Question 4: 
Given n non-negative integers representing an elevation map where the width of
each bar is 1, compute how much water it can trap after raining.
Example 1:
Input: height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Output: 6
Explanation: The above elevation map (black section) is represented by array
[0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section)
are being trapped. */

class Q4_{
    static int calc(int arr[]){
        int len=arr.length;

        int res=0,l=0,r=len-1;
        int lmax=arr[l],rmax=arr[r];

        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,arr[l]);
                res+=(lmax-arr[l]);
            }
            else{
                r--;
                rmax=Math.max(rmax,arr[r]);
                res+=(rmax-arr[r]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(calc(arr));
    }
}