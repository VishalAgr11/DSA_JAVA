import java.util.*;

class binstr{
    static void binstr(int n, int last,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        // if(last==0){
        //     binstr(n-1,0,str.append("0"));
        //     binstr(n-1,1,str.append("1"));
        // }
        // else{
        //     binstr(n-1,0,str.append("0"));
        // } do not use string builder, we need to remove last characters
        binstr(n-1,0,str+"0");
        if(last!=1){
            binstr(n-1,1,str+"1");
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        binstr(n,0,"");
    }
}