import java.util.*;

class palindrome{
    static boolean check(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string to be checked");
        String str = in.next();
        System.out.println((check(str.toUpperCase())?"Palindrome":"Non Palindrome"));
    }
}