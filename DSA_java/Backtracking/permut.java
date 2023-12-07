import java.util.*;

class permut{
    static void recurse(String s,String ans){
        if(s.equals("")){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String nstr=s.substring(0,i)+s.substring(i+1,s.length());
            recurse(nstr,ans+ch);
        }
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
        recurse(s,"");
    }
}