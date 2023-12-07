/*
We are given a string S, we need to find the count of all contiguous substrings
starting and ending with the same character.
Sample Input 1 : S = "abcab"
Sample Output 1 : 7
There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7
contiguous substrings start and end with the same character.
Sample Input 2 : S = "aba"
Sample Output 2 : 4
The substrings are a, b, a and aba. */

import java.util.*;

class Q4{
    // static int recurse(String s,int i,int j, int a){
    //     int inner;
    //     if(j==s.length() || i==s.length()){
    //         return a;
    //     }
    //     if(s.charAt(i)==s.charAt(j)){
    //        inner= 1+ recurse(s,i,j+1,a+1);
    //     }
    //     else{
    //         inner= recurse(s,i,j+1,a);
    //     }
    //     i++;
    //     int outer = recurse(s,i,i,a);
    //     return inner+outer;
    // }
     public static int recurse(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0; 
        }
        int res1= recurse(str, i + 1, j, n - 1);
        if (str.charAt(i) == str.charAt(j)) {
           res1++;
        }
        int res2=recurse(str, i, j - 1, n - 1);
        if (str.charAt(i) == str.charAt(j)) {
           res2++;
        }
        int res3= recurse(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
           res3++;
        }
        System.out.println(res1+" "+res2+" "+res3);
        return res1+res2-res3;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println(recurse("abcab",0,4,5));
    }
}