/*
Question 3 : 
Add 1 to an integer using Bit Manipulation.
(Hint : try using Bitwise NOT Operator)
*/
import java.util.*;

class Q3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("num +1 is: " + -~num);// since -x= ~x+1, -~x=x+1
    }
}