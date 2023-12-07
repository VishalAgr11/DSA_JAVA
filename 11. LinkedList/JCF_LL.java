import java.util.*;

public class JCF_LL {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<Integer>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
