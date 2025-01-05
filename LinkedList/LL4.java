public class LL4 {
    Node head;
    Node tail;

    static class Node{
        int data;
        Node next;
    
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void add(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
    }
    public void addlast(int val)
    {

        if(tail==null){

            Node node=new Node(val);
            tail.next=node;
            tail=node;
        }

    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        
        
    }
    public static void main(String[] args) {
        LL4 list=new LL4();
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
    }



    
}
