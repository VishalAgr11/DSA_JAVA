import java.util.*;

class A2dlist{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainl=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(2);
        l1.add(3);
        mainl.add(l1);
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(4);
        l2.add(5);
        mainl.add(l2);

        for(int i=0; i<mainl.size(); i++){
            ArrayList<Integer> curr=mainl.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainl);

        ArrayList<ArrayList<Integer>> mainl2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        ArrayList<Integer> l4=new ArrayList<>();
        ArrayList<Integer> l5=new ArrayList<>();

        for(int i=1;i<6;i++){
            l3.add(i*1); // 1 2 3 4 5
            l4.add(i*2);
            l5.add(i*3);
        }
        mainl2.add(l3);
        mainl2.add(l4);
        mainl2.add(l5);

        for(int i=0; i<mainl2.size(); i++){
            ArrayList<Integer> curr=mainl2.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainl2);
    }
}