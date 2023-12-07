import java.util.*;

class Q4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(65|32);
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char)(ch| ' '));
        }
    }
}