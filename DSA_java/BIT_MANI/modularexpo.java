import java.util.*;
class modularexpo{
    static int exps(int a, int n, int m){
        int ans=1;
        while(n>0){
            if((n &1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans%m;
    }
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number, power,modulo");
        int x = in.nextInt();
        int i = in.nextInt();
        int m = in.nextInt();
        System.out.println(exps(x,i,m));
    }
}