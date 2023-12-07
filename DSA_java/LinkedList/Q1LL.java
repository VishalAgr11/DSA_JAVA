/* 
Intersection of Two Linked Lists
In a system there are two singly linked list. By some programming error, 
the end node of one of the linked lists got linked to the second list, forming an inverted Y-shaped list. 
Write a program to get the point where two linked lists merge.
We have to find the intersection part in this system.
*/

public class Q1LL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public Node intersect(Node head1, Node head2){
        Node temp1 = head1;
        while(temp1 != null){
            Node temp2 = head2;
            while(temp2 != null){
                if(temp1 == temp2){
                    return temp2;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return null;
    }
    public static void main(String[] args){
        Q1LL obj=new Q1LL();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
        Node intersectionPoint= obj.intersect(head1, head2);
        if (intersectionPoint == null) {
            System.out.print(" No Intersection Point \n");
        }
        else {
            System.out.print("Intersection Point: "+ intersectionPoint.data);
        }
    }
}
