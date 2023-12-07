import java.util.*;

class xpown{
    static int pow(int a, int n){
        if(n>1){
            return (a*(pow(a,n-1)));
        }
        return a;//
        //or the base case can be n==0, return 1;
    }
    public static void main(String[] args){
        System.out.println(pow(2,10));
    }
}