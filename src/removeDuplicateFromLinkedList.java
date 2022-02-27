import java.util.HashSet;
import java.util.Scanner;
public class removeDuplicateFromLinkedList {
    // Node
    class Node1{
        int data;
        Node1 next;
    }
    class linkedList
    {
        Node1 head;
        Node1 tail;
        int size;
        void add(int val)
        {
            if(size==0)
            {
              Node1 newnode=new Node1();
              newnode.data=val;
              newnode.next=null;
              head=tail=newnode;
              size++;
            }
            else {
                Node1 newNode=new Node1();
                newNode.data=val;
                newNode.next=null;
                tail.next=newNode;
                tail=newNode;
                size++;
            }
        }
//         //remove duplicate from sorted list..
//        void removeDuplicateElement()
//        {
//            Node1 temp=head;
//            while(temp!=null&&temp.next!=null)
//            {
//                if(temp.data==temp.next.data) {
//                    temp.next = temp.next.next;
//                }
//                else
//                {
//                    temp=temp.next;
//                }
//            }
//
//        }
//
        // this is duplicate from unsorted linked list with o(n2) complexity..
//void removeDuplicateElement()
//{
//    Node1 temp=head;
//    while(temp!=null&&temp.next!=null)
//    {
//        Node1 temp1=temp;
//        while(temp1.next!=null)
//        {
//            if(temp.data==temp1.next.data)
//            {
//                //prev=temp1.next;
//                temp1.next=temp1.next.next;
//                //System.gc();
//            }
//            else
//            {
//                //prev=temp;
//                temp1=temp1.next;
//            }
//        }
//        temp=temp.next;
//    }
//
//}
// remove duplicate from un sorted list..
        void removeDuplicateElement()
        {
            HashSet<Integer>hs=new HashSet<>();
            Node1 curr=head;
            Node1 prev=null;
            while(curr!=null)
            {
                int curval=curr.data;
                if(hs.contains(curval))
                {
                    prev.next=curr.next;
                }
                else
                {
                    hs.add(curval);
                }
                curr=curr.next;
            }


        }



        public void display()
        {
            Node1 temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("Null");
        }
    }
}
class testDemo
{
    public static void main(String[] args) {
        removeDuplicateFromLinkedList obj=new removeDuplicateFromLinkedList();
        removeDuplicateFromLinkedList.Node1 node=obj.new Node1();
        removeDuplicateFromLinkedList.linkedList ll=obj.new linkedList();
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the node Element->");
        for (int i = 0; i <10; i++) {
            ll.add(readme.nextInt());
        }
        ll.removeDuplicateElement();
        ll.display();
    }

}
