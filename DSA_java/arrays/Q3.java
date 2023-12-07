/*You are given an array prices where prices[i] is the price of a given stock on
the i
th day.
Return the maximum profit you can achieve from this transaction. If you cannot
achieve any profit, return 0.
Example 1:
Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because
you must buy before you sell.
 */

import java.util.*;

class Q3{
    static int buysell(int arr[]){
        int maxp=0;
        int bp=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>bp){
                maxp=Math.max(maxp,(arr[i]-bp));
            }
            else{
                bp=arr[i];
            }
        }
        return maxp;
    }
    public static void main(String[] args) {
        // int arr[]={7,1,5,3,6,4};
        int arr[]={7,6,4,3,1};
        System.out.println(buysell(arr));
    }
}