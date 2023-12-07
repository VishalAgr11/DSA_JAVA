/*
Question 3 : Write a program to find Length of a String using Recursion
*/
import java.util.*;

class Q3{
    static int recurse(String s, int i){
        if(s.equals("")){
            return i;
        }
        return recurse(s.substring(0,s.length()-1), i+1);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(recurse(s,0));
    }
}