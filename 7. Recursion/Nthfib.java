import java.util.*;

class Nthfib{
    static int fib(int nth){
        if(nth==0){
            return 0;
        }
        if(nth==1){
            return 1;
        }
        return (fib(nth-1)+fib(nth-2));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(fib(9));
    }
}