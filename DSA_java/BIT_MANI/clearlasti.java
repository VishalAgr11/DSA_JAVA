import java.util.*;
class clearlasti{
    static int update(int x,int i){
        int bitmask= ((~0)<<i);
        return (x & bitmask);
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int x = in.nextInt();
        int i = in.nextInt();
        System.out.println(update(x,i));
    }
}