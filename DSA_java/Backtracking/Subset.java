import java.util.*;

class Subset{
    static void recurse(String s, int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        recurse(s,i+1,(ans+s.charAt(i)));
        recurse(s,i+1,ans);
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
        recurse(s,0,"");
    }
}