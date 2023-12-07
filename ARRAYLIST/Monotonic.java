/*
Monotonic ArrayList (EASY)
An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). 
An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise. 
Sample Input 1 : nums = [1,2,2,3]
Sample Output 1 : true
Sample Input 2 : nums = [6,5,4,4]
Sample Output 2 : true
Sample Input 3 : nums = [1,3,2]
Sample Output 3 : false
*/

import java.util.*;

class Monotonic{
    static boolean check(ArrayList<Integer> list){
        boolean result = true;
        for(int i=0; i<list.size()-2; i++){
            if((list.get(i)<=list.get(i+1) && list.get(i+1)<=list.get(i+2) )|| (list.get(i)>=list.get(i+1)&&list.get(i+1)>=list.get(i+2))){
                result = true;
            }
            else{
                result = false;
            }
        }
        return result;
    }

    //another implementation
    public static boolean check2(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i=0; i<A.size()-1; i++) {
            if (A.get(i) > A.get(i+1))
                inc = false;
            if (A.get(i) < A.get(i+1))
                dec = false;
        }
        return inc || dec;
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
        System.out.println(check(l1)?"Found":"Not Found");
        System.out.println(check2(l1)?"Found":"Not Found");
    }
}