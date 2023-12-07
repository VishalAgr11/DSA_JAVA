public class Intro{
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

    public void addFirst(int data){
        // Step 1: Creating a new node
        Node newnode = new Node(data);
        size++;
        if(head == null){// Steps for an empty linked list
            head=tail=newnode;
            return;
        }
        // Step 2: linking head to new ll
        newnode.next = head;
        // Step 3: Updating the head
        head=newnode;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head=tail=newnode;
            return;
        }
        tail.next = newnode;
        tail= newnode ;

    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void prints(){
        if (head==null){
            System.out.println("Empty head");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Empty List");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Empty List");
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int i=0,val=0;
        Node temp=head;
        while(i<size-2){
            temp=temp.next;
            i++;
        }
        val=temp.next.data;
        temp.next=null;
        size--;  
        return val;
    }

    public int itrSearch(int key){
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                return i;
            }
           temp=temp.next; 
           i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        Node temp=head.next;
        int idx= helper(temp,key);
        if(idx==-1){
            return -1;
        }
        else{
            return ++idx;
        }
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void removenthend(int idx){
        if(idx==size){
            head=head.next;
            return;
        }
        int i=1;
        int itofind=size-idx;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalin(){
        if(head==null || head.next==null){
            return true;
        }
        //Step 1: find the mid node
        Node mid=findMid(head);
        //Step 2: Reverse the half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //Step 3: check 1st half with last half
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        // Step 1: Check cycle
        boolean flag= false;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow){
                flag= true;
                break;
            }
        }
        if(flag==false){
            System.out.println("No cycle detected");
            return;
        }
        // Step 2: Find the meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node left, Node right){
        Node merged=new Node(-1);
        Node temp=merged;

        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }
            else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }
        while(right!=null){
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        while(left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        return merged.next;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newL=mergeSort(head);
        Node newR=mergeSort(rightHead);

        return merge(newL, newR);
    }
    public void zigZag(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        while(left!=null && right!= null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            right=nextR;
            left=nextL;
        }

    }
    public static void main(String[] args){
        Intro ll= new Intro();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(5);
        ll.addLast(6);
        // head =new Node(0);
        // Node temp=new Node(1);
        // head.next=temp;
        // temp.next= new Node(2);
        // temp.next.next =new Node(3);
        // temp.next.next.next=temp;

        ll.addLast(7);
        ll.add(2,9);
        //System.out.println(ll.head.data);
        ll.prints();
        // System.out.println(ll.itrSearch(4)>=0?"Found at "+ll.itrSearch(4):"Not found");
        // System.out.println(ll.removeFirst()+" is the removed element");
        // ll.prints();
        // System.out.println(ll.itrSearch(4)>=0?"Found at "+ll.itrSearch(4):"Not found");
        // System.out.println(ll.recSearch(5)>=0?"Found at "+ll.recSearch(5):"Not found");
        //ll.prints();
        // ll.removenthend(2);
        // ll.reverse();
        //ll.prints();
        //System.out.println(size);
        //System.out.println(ll.checkPalin()?"Is Palindrome":"Not Palindrome");
        // System.out.println(isCycle()?"Is cycle":"No cycle");
        // removeCycle();
        // ll.prints();
        // System.out.println(isCycle()?"Is cycle":"No cycle");
        head=ll.mergeSort(head);
        ll.prints();
        ll.zigZag(head);
        ll.prints();
    }
}