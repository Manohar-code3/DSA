// import java.util.*;
public class LL2 {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void iAtB(int data)
    {
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;

    }
    public void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;

        }
        Node last =head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=newnode;


    }
    public void delete(int value)
    {
        Node temp=head;
        Node prev=null;
        if(temp!=null && temp.data==value)
        {
            head=temp.next;
            return;
        }
        while(temp!=null && temp.data!=value)
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp== null)
        {
            return;
        }
        prev.next=temp.next;
    }
    public void print()
    {
        Node current=head;
        while (current!=null) {
            System.out.print(current.data+"->");
            current=current.next;
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
    
        LL2 list=new LL2();
        list.iAtB(1);
        list.iAtB(2);
        list.iAtB(3);
        list.iAtB(4);
        list.print();
        list.insert(-1);
        list.insert(-2);
        list.print();
        list.delete(2);
        list.delete(3);
        list.print();

        
        

        
    }

    
}
