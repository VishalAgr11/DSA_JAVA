import java.util.*;
class checkevenodd{
    static void check(int x){
        int bitmask=1;
        if((x & bitmask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int x = in.nextInt();
        check(x);
    }
}
