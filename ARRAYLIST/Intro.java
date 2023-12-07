import java.util.ArrayList;
import java.util.Collections;

class Intro{
    static void swaps(ArrayList<Integer> list,int id1, int id2){
        int temp=list.get(id1);
        list.set(id1,list.get(id2));
        list.set(id2,temp);
    }
    public static void main (String[] args){
        ArrayList<Integer> l1= new ArrayList<Integer>();
        ArrayList<Integer> l2= new ArrayList<Integer>();
        ArrayList<Integer> l3= new ArrayList<Integer>();

        l1.add(1); //O(1)
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1);

        // Get - O(1)
        int ele=l1.get(2);
        System.out.println("the 2nd element is = "+ele);

        // Delete - O(n)
        l1.remove(2);
        System.out.println(l1);

        //Set- O(n)
        l1.set(2,10);// replaces the current 2nd element
        System.out.println(l1);

        //Add at a position(pos,value)-- O(n)
        l1.add(1,5);
        System.out.println(l1);

        //comtains
        System.out.println(l1.contains(1));
        System.out.println(l1.contains(11));

        // size of AL
        System.out.println(l1.size());
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        //Reverse printing
        for(int i=l1.size()-1;i>=0;i--){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        // Finding Maximum
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l1.size();i++){
            if(l1.get(i)>max){
                max=l1.get(i);
            }
        }
        System.out.println("The maximum value is " + max);
        l1.add(8);
        l1.add(49);
        System.out.println("The maximum value is " + Collections.max(l1));

        // function to swap index 2,5
        System.out.println(l1);
        swaps(l1,2,5);
        System.out.println(l1);

        // sorting - best optimized [O (nlogn)]
        Collections.sort(l1);// ascending
        System.out.println(l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);
        // here Comparator- functions which define logic of comparison 
    }
}