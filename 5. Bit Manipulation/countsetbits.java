import java.util.*;
class countsetbits{
    static void check(int x){
        int bitmask=1, count=0;
        while(x!=0){
            count+= ((x & bitmask) ==1)?1:0;
            x=x>>1;
        }
        System.out.println(count);
    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int x = in.nextInt();
        check(x);
    }
}