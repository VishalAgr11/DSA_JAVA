import java.util.*;

class Duplicatestr{
    static String dupli(String s,int i, StringBuilder nstr,boolean arr[]){
        if(i==s.length()){
            return nstr.toString();
        }
        if(arr[(s.charAt(i))-'a']==true){
            return dupli(s,i+1,nstr,arr).toString();
        }
        else{
            nstr.append(s.charAt(i));
            arr[(s.charAt(i))-'a']=true;
            return dupli(s,i+1,nstr,arr).toString();
        }
    }
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);
        String s=in.nextLine();
        boolean[] arr=new boolean[26];
        StringBuilder nstr=new StringBuilder();
        System.out.println(dupli(s,0,nstr,arr));
    }
}