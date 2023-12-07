/*
Question 1 : Count how many times lowercase vowels occurred in a String entered by the
user. */
import java.util.*;

class Q1{
    static int lowv(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch == 'a' || ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
                count ++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=in.next();
        System.out.println("Lowercase vowels = "+(lowv(str)));
    }
}