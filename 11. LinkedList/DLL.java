//import java.util.*;

public class DLL {
    public static class Node{
        int data;
        Node prev;
        Node next; 
    
        public Node(int data){
            this.data=data;
            next=null;
            prev=null; 
        }
    }
    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int remFirst(){
        if(head==null){
            System.out.println("Empty");
            return -9999;
        }
        int val=head.data;
        if(size==1){
            head=tail=null;
            size--;
            return val;
        }
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public int remLast(){
        if(head==null){
            System.out.println("Empty");
            return -9999;
        }
        int val=tail.data;
        if(size==1){
            head=tail=null;
            size--;
            return val;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    public Node reverse(){
        Node curr=head;
        Node prev= null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    public static void main(String[] args){
        DLL obj=new DLL();
        obj.addFirst(2);
        obj.addFirst(1);
        obj.addLast(3);
        obj.addFirst(0);
        obj.print();
        System.out.println(obj.size);
        obj.remFirst();
        obj.remLast();
        obj.print();
        obj.reverse();
        obj.print();
    }
}
