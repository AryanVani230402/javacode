public class LL {
    Node head=null;
    static class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    public void add_first(int val)
    {
        Node node = new Node(val);
        if(head==null)
        {
            head=node;
            node.next=null;
            return;
        }
        node.next=head;
        head=node;
    }

    public void add_last(int val)
    {
        Node ptr;
        ptr=head;
        Node node = new Node(val);
        if(head==null)
        {
            head=node;
            node.next=null;
            return;
        }

        while (ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=node;
        node.next=null;
    }

    public void Traverse ()
    {
        Node ptr;
        ptr = head;
        while (ptr!=null)
        {
            System.out.print(ptr.val + "==>");
            ptr=ptr.next;

            if(ptr==null){System.out.print("null");}
        }
    }

    public void add_specific_location(int val,int location)
    {
        Node ptr;
        ptr=head;
        Node node = new Node(val);

        for(int i=1;i<location-1;i++)
        {
            ptr=ptr.next;
        }
        node.next=ptr.next;
        ptr.next=node;

    }

    public void ReverseList()
    {
        Node curr=head;
        Node prev=null;
        Node next=null;

        while (curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public static void main(String[] args) {

//        methods available
//        {
//            1)add_last;
//            2)add_first;
//            3)add_specific_location;
//            4)Traverse;
//            5)reverse;
//        }

        LL myLinkList = new LL();
        myLinkList.add_first(9);
        myLinkList.add_last(10);
        myLinkList.add_last(11);
        myLinkList.add_last(12);
        myLinkList.add_last(14);
        myLinkList.add_last(15);
        myLinkList.add_specific_location(13, 5);
        myLinkList.Traverse();
        myLinkList.ReverseList();
        System.out.println();
        myLinkList.Traverse();

    }
}

