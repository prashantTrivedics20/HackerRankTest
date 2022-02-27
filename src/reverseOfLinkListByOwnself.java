import java.util.Scanner;
public class reverseOfLinkListByOwnself {
    //node class
    static class Node{
        int data;
        Node next;
    }
    static class linklist
    {
        Node head;// it is represented the first node
        Node tail;// it represented the last node
        int size;
        // add first
        void addFirst(int val)
        {

//      if(head==null)
//            {
//
//            }
            Node newNode=new Node();
            newNode.data=val;
            newNode.next=null;
            newNode.next=head;
            head=newNode;

            size++;
        }
        void reverseLinkList()
        {
            // reverse process
            Node prevNode=head;
            Node currNode=head.next;
            while(currNode!=null)
            {
                Node nextNode=currNode.next;
                currNode.next=prevNode;
                //update..
                prevNode=currNode;
                currNode=nextNode;
            }
            head.next=null;
            head=prevNode;

        }
    }
    public void display(linklist list)
    {
       Scanner readme=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the "+(i+1)+"first element");
            list.addFirst(readme.nextInt());
        }
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
        System.out.println("reverse LinkedList..");
        list.reverseLinkList();
        Node temp1 = list.head;
        while (temp1 != null) {
            System.out.print(temp1.data + "->");
            temp1 = temp1.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        reverseOfLinkListByOwnself obj=new reverseOfLinkListByOwnself();
        linklist ll=new linklist();
        obj.display(ll);

    }

}
