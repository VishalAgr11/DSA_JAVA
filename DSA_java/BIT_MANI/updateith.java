import java.util.*;
class updateith{
    static int update(int x,int i, int b){
        int bitmaskcl = ~(1<<i);
        x=x&bitmaskcl;
        System.out.println(x);
        int bitmask= (b<<i);
        return (x | bitmask);
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int x = in.nextInt();
        int i = in.nextInt();
        int b = in.nextInt();
        System.out.println(update(x,i,b));
    }
}