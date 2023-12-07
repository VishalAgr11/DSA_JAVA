import java.util.*;
class getith{
    static int check(int x,int i){
        int bitmask=1<<i;
        return (((x & bitmask)==0)?0:1);
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int x = in.nextInt();
        int i = in.nextInt();
        System.out.println(check(x,i));
    }
}