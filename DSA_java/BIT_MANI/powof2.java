import java.util.*;
class powof2{
    static void check(int x){
        int bitmask=1;
        if((x & (x-1))==0){
            System.out.println("Pow of 2");
        }
        else{
            System.out.println("Not pow");
        }
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int x = in.nextInt();
        check(x);
    }
}