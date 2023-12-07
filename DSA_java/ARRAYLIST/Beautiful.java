/*
Beautiful ArrayList (MEDIUM)
An Arraylist nums of size n is beautiful if:
nums is a permutation of the integers in the range [1, n].
For every 0 <= i < j < n, there is no indexkwithi<k<jwhere2*nums.get(k)==nums.get(i)+ nums.get(j).
Given the integer n, return any beautiful arraylist nums of size n. 
There will be at least one valid answer for the given n.
Sample Input 1 : n = 4 Sample Output 1 : [2,1,4,3]
Sample Input 2 : n = 5 Sample Output 2 : [3,1,2,5,4]
Constraints :
● 1<=n<=1000 
*/

import java.util.*;

class Beautiful{
    static ArrayList<Integer> check(int n){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(1);

        for(int i=1;i<n;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<ans.size();j++){
                if(ans.get(j)*2-1 < n){
                    temp.add(ans.get(j)*2-1);
                }
                else{
                    continue;
                }
            }
            for(int j=0;j<ans.size();j++){
                if(ans.get(j) * 2< n){
                    temp.add(ans.get(j) * 2);
                }
                else{
                    continue;
                }
            }
            ans = temp;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        System.out.println(check(n));
    }
}