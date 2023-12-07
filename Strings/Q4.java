/*
Question 4 : Determine if 2 Strings are anagrams of each other.
What are anagrams?
If two strings contain the same characters but in a different order, they can be said to be
anagrams. Consider race and care. In this case, race's characters can be formed into a study,
or care's characters can be formed into race. Below is a java program to check if two strings
are anagrams or not.
 */
import java.util.*;
class Q4{
    static boolean check(String str1,String str2){
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        if(str1.length()==str2.length()){
            char st1[]=str1.toCharArray();
            char st2[]=str2.toCharArray();

            Arrays.sort(st1);
            Arrays.sort(st2);

            return(Arrays.equals(st1,st2));
        }
        return false;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter strings: ");
        String str1=in.next();
        String str2=in.next();
        System.out.println("Anagrams? = "+(check(str1,str2)));
    }
}