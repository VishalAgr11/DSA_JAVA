/*Question 1 : Print the sum, difference and product of two complex numbers by creating a class named 
'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user. */

import java.util.*;

class Complex{
    int r,i;
    Complex(int r,int i){
        this.r = r;
        this.i = i;
    }
    public String toString(){
        // return (r+" + "+i + "i");
        if(r==0){
            return (i+ "i");
        }
        else if(i==0){
            return (r+"");
        }
        else{
            return (r+" + "+i + "i");
        }
    }
}
public class Q1{
    Complex add(Complex n1,Complex n2){
        int real = n1.r + n2.r;
        int imag = n1.i + n2.i;
        Complex sum = new Complex(real, imag);
        return sum;
    }
    Complex diff(Complex n1,Complex n2){
        int real = n1.r - n2.r;
        int imag = n1.i - n2.i;
        Complex min = new Complex(real, imag);
        return min;
    }
    Complex mul(Complex n1,Complex n2){
        int real = (n1.r * n2.r)-(n1.i * n2.i);
        int imag = (n1.r * n2.i)-(n1.i*n2.r);
        Complex m = new Complex(real, imag);
        return m;
    }
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter real and imag parts of 2 numbers");
        int real=in.nextInt();
        int imag=in.nextInt();
        Complex n1=new Complex(real,imag);
        real=in.nextInt();
        imag=in.nextInt();
        Complex n2=new Complex(real,imag);
        Q1 obj=new Q1();
        System.out.println("Addition = "+obj.add(n1,n2));
        System.out.println("Subtraction = "+obj.diff(n1,n2));
        System.out.println("Multiplication = "+obj.mul(n1,n2));
    }
}
