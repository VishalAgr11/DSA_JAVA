/*
Question 2 :
Lonely Numbers in ArrayList (MEDIUM)
You are given an integer arraylist nums. A number x is lonely when it appears only once, and
no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
Return all lonely numbers in nums. You may return the answer in any order.
Sample Input 1 : nums = [10,6,5,8]
Sample Output 1 : [10,8]
Explanation :
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums. 
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa. Hence, the lonely numbers in nums are [10, 8].
Note that [8, 10] may also be returned.
Sample Input 2 : nums = [1,3,5,3]
Sample Output 2 : [1,5]
Explanation :
- 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums. - 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums. - 3 is not a lonely number since it appears twice.
Hence, the lonely numbers in nums are [1, 5]. Note that [5, 1] may also be returned.
*/ 

import java.util.*;

class Lonely{
    static ArrayList<Integer> check(ArrayList<Integer> list){
        ArrayList<Integer> lnew = new ArrayList<Integer>();
        for(int i=0; i<list.size(); i++){
            int num = list.get(i);
            int j;
            for(j=0; j<list.size(); j++){
                if(i==j){
                    continue;
                }
                int check = list.get(j);
                if(check == num-1 || check ==num+1 || check == num){
                    break;
                }
            }
            if(j==list.size()){
                lnew.add(num);
            }
        }
        return lnew;
    }

    //O(n) approach
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i < nums.size()-1; i++) {
            if (nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1)){
                list.add(nums.get(i));
            } 
        }
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)) {
                list.add(nums.get(nums.size()-1));
            }
        }
    return list;
    }


    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the array values press -1 to stop");
        ArrayList<Integer> l1=new ArrayList<Integer>();
        int inpu=in.nextInt();
        while(inpu>=0){
            l1.add(inpu);
            inpu=in.nextInt();
        }
        System.out.println(check(l1));
        System.out.println(findLonely(l1));
    }
}