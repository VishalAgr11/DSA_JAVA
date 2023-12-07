/*
  Delete N Nodes After M Nodes of a Linked List
We have a linked list and two integers M and N. 
Traverse the linked list such that you retain M nodes then delete next N nodes, continue the same till end of the linked list.
Sample Input 1 : M=2 N=2 LL: 1->2->3->4->5->6->7->8 
Sample Output 1 : 1->2->5->6
Sample Input 2 : M=3 N=2 LL: 1->2->3->4->5->6->7->8->9->10 
Sample Output 2 : 1->2->3->6->7->8
 */

public class Q2LL {
    static class Node{
        int data;
        Node next;
    };

    static Node push( Node head_ref, int new_data){
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }
    static void printList( Node head){
        Node temp = head;
        while (temp != null){
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

    public static void del(Node head, int m, int n){
        Node curr = head,t;
        int count;

        while(curr!=null){
            for(count=1;count<m && curr!=null;count++){
                curr = curr.next;
            }
            if(curr==null){
                return;
            }
            t=curr.next;
            for(count=0;count<n && t!=null;count++){
                t=t.next;
            }
            curr.next = t;
            curr=t;
        }
    }
    public static void main(String args[]){
        Node head = null;
        int M=2, N=3;
        head=push(head, 10);
        head=push(head, 9);
        head=push(head, 8);
        head=push(head, 7);
        head=push(head, 6);
        head=push(head, 5);
        head=push(head, 4);
        head=push(head, 3);
        head=push(head, 2);
        head=push(head, 1);
        System.out.printf("M = %d, N = %d \n" +"Linked list we have is :\n", M, N);
        printList(head);
        del(head, M, N);
        System.out.printf("\nLinked list on deletion is :\n");
        printList(head);
    }
}
