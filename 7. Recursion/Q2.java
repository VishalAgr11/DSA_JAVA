/*
Question 2 :
You are given a number (eg - 2019), convert it into a String of english like
“two zero one nine”. Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
can’t be 0 
*/
import java.util.*;

class Q2{
    static String[] arr={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight","Nine"};
    static void recurse(int n){
        if(n==0){
            return;
        }
        recurse(n/10);
        System.out.print(arr[n%10]+" ");
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        recurse(n);
    }
}