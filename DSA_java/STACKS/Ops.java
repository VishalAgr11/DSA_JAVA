package DSA_java.STACKS;
import java.util.*;

public class Ops {
    public static void pushBase(Stack <Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int val=st.pop();
        pushBase(st,data);
        st.push(val);
    }

    public static String RevStr(String str){
        Stack <Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx++));
        }
        StringBuilder sb=new StringBuilder("");
        while(!s.isEmpty()){
            char ch=s.pop();
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void revSt(Stack <Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        revSt(st);
        pushBase(st,top);
    }

    public void prints(Stack<Integer> sts){
        while(!sts.isEmpty()){
            System.out.print(sts.peek()+" ");
            sts.pop();
        }
        System.out.println();
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        Ops obj = new Ops();
        st.push(1);
        st.push(2);
        st.push(3);
        pushBase(st,5);
        System.out.println(st);
        System.out.println(RevStr("apple"));
        revSt(st);
        System.out.println(st);
        obj.prints(st);
    }
}
