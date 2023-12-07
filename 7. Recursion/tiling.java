import java.util.*;

class tiling{
    static int calc(int n){
        if(n==0 || n==1){
            return 1;
        } 

        int fnm1=calc(n-1);// vertical choice
        int fnm2=calc(n-2);// horizontal choice
        return fnm1+fnm2;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("No of ways="+calc(n));
    }
}