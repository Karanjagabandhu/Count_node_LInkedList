public class LLcountnode {
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    public LLcountnode()
    {
        this.head=null;

    }
    //Method to add node on the linkedlist accordingly
    public void insert(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }
    //Method to display all the node of the linkedlist
    public void display()
    {
        int count=0;
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data+"->");
            current=current.next;
            count++;
        }
        System.out.println("null...");
        System.out.println( "The no of node are availevel in the linkedlist is -----"+count);
    }
    public static void main(String args[])
    {
        LLcountnode list=new LLcountnode();
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insert(15);
        list.display();
    }
    
}
