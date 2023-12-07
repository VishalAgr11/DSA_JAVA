package DSA_java.STACKS;

public class usingLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            next=null;
        }
    }
    static Node head=null;
    static class Stack{

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node temp= new Node(data);
            if(isEmpty()){
                head=temp;
                return;
            }
            temp.next=head;
            head=temp;
        }

        public static int pop(){
            if(isEmpty()){
                return -9999;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        
        public static int peek(){
            if(isEmpty()){
                return -9999;
            }
            int top=head.data;
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

