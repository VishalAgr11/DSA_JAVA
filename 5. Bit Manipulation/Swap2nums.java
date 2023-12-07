import java.util.*;
class Swap2nums{
    static void swap(int x,int y){
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x+" "+y);
    }
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the numbers");
        int x = in.nextInt();
        int i = in.nextInt();
        swap(x,i);
    }
}