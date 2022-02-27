import java.util.*;
public class reverseALinkListUsingCollectionFrame {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        for(Integer i1:ll)
        {
            System.out.print(i1+"->");
        }
        System.out.println("NULL");
        //reverse a LinkedList by using collection framework.....
        System.out.println("after reverse the linked list");
        for (int i = ll.size()-1; i>=0; i--) {
            System.out.print(ll.get(i)+"->");
        }
        System.out.println("NULL");

    }
}
