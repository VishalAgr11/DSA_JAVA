/*
 We have a linked list and two keys in it, swap nodes for two given keys. 
 Nodes should be swapped by changing links. 
 Swapping data of nodes may be expensive in many situations when data contains many fields. 
 It may be assumed that all keys in the linked list are distinct.
 Sample Input 1 : 1->2->3->4, x = 2, y = 4 
 Sample Output 1 : 1->4->3->2
 */

public class Q3LL {
    class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    Node head;
    public void push(int new_data){
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }
    public void printList(){
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public void swapNodes(int x, int y){
        Node currx=head,curry=head;
        Node prevx=null,prevy=null;

        while(currx!=null && currx.data!=x){
            prevx=currx;
            currx=currx.next;
        }
        while(curry!=null && curry.data!=y){
            prevy=curry;
            curry=curry.next;
        }

        if(currx==null || curry==null){
            return;
        }

        if (prevx!=null){
            prevx.next=curry;
        }
        else{
            head=curry;
        }
        if (prevy!=null){
            prevy.next=currx;
        }
        else{
            head=currx;
        }

        Node temp=currx.next;
        currx.next=curry.next;
        curry.next=temp;
    }
    public static void main(String[] args){
        Q3LL llist = new Q3LL();
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        System.out.print("\n Linked list before ");
        llist.printList();
        llist.swapNodes(4, 3);
        System.out.print("\n Linked list after ");
        llist.printList();
    }
}
