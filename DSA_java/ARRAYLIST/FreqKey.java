/*
Most Frequent Number following Key (EASY)
You are given an integer Arraylist nums. You are also given an integer key, which is present in
nums.
For every unique integer target in nums, count the number of times target immediately follows an occurrence of key in nums. 
In other words, count the number of indices i such that:
0 <= i <= nums.size() - 2,
nums.get(i) == key and,
nums.get(i+1) == target.
Return the target with the maximum count.
(Assumption - that the target with maximum count is unique.)
Sample Input 1 :nums = [1,100,200,1,100], key = 1
Sample Output 1 : 100
Explanation :
For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key. 
No other integers follow an occurrence of key, so we return 100.

Sample Input 2 : nums = [2,2,2,2,3], key = 2
Sample Output 2 : 2
Explanation :
For target = 2, there are 3 occurrences at indices 1, 2, and 3 which follow an occurrence of key. 
For target = 3, there is only one occurrence at index 4 which follows an occurrence of key. 
target = 2 has the maximum number of occurrences following an occurrence of key, so we return 2.
*/

import java.util.*;

class FreqKey{
    static int check(ArrayList<Integer> list,int key){
        int maxi=Integer.MIN_VALUE;
        int targ=0,target,count;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)== key){
                target=list.get(i+1);
                count=0;
            }
            else{
                System.out.println("Continuing");
                continue;
            }
            for(int j=0;j<list.size()-1;j++){
                if(target==list.get(j+1) && list.get(j)== key){
                    count++;
                }
            }
            if(count>maxi){
                maxi=count;
                targ=target;
            }
        }
        return targ;
    }

    //Better structured approach 

    static int check2(ArrayList<Integer> list,int key){
        int res[]=new int[1000];
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                res[list.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0; i<1000; i++){
            if(res[i] > max){
                max = res[i];
                ans = i+1; 
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter key");
        int key=in.nextInt();
        System.out.println("Enter the array values press -1 to stop");
        ArrayList<Integer> l1=new ArrayList<Integer>();
        int inpu=in.nextInt();//[1,100,200,1,100], key = 1, Sample Output 1 : 100
        while(inpu>=0){// nums = [2,2,2,2,3], key = 2 out =2
            l1.add(inpu);
            inpu=in.nextInt();
        }
        System.out.println(check(l1,key));
        System.out.println(check2(l1,key));
    }
}