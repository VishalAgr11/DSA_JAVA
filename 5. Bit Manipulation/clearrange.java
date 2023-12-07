import java.util.*;
class clearrange{
    static int update(int x,int i,int j){
        int a= (~0)<<(j+1);
        int b= (1<<i)-1;
        int bitmask= a|b;
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