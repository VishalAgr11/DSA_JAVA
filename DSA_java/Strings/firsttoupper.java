import java.util.*;

class firsttoupper{
    static String conv(String str){
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch==' ' && i!=str.length()-1){
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string to be conerted");
        String str = in.nextLine();
        System.out.println("The modified string is: "+conv(str));
    }
}