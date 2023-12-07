import java.util.*;

class pairing{
    static int dupli(int num){
        if(num==1 || num==2){
            return num;
        }
        int fnm1=dupli(num-1);
        int fnm2=(num-1)*dupli(num-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);
        int n=in.nextInt();
        System.out.println(dupli(n));
    }
}