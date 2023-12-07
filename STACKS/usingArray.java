package DSA_java.STACKS;
import java.util.ArrayList;

public class usingArray {
    static class Stack{
        static ArrayList<Integer> st = new ArrayList<Integer>();
        public static boolean isEmpty(){
            return st.size() == 0;
        }

        public static void push(int data){
            st.add(data);
        }

        public static int pop(){
            int top=st.get(st.size()-1);
            st.remove(st.size()-1);
            return top;
        }

        public static int peek(){
            int top=st.get(st.size()-1);
            return top;
        }
    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
