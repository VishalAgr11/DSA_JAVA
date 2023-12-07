import java.util.*;

class compression{
    static String comp(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count ++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=in.next();
        System.out.println("compressed = "+(comp(str)));
    }
}