import java.util.*;

class xpownopt{
    static int pow(int a, int n){
        if(n==0){
            return 1;
        }
        int half=pow(a,n/2);
        int calc =half*half;
        if(n%2==1){
            calc=a*calc;
        }
        return calc;
    }
    public static void main(String[] args){
        System.out.println(pow(2,25));
    }
}