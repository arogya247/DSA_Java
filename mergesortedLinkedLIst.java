public class LinkedList
{
    Node head;
    
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    public void mergeList(Node head1, Node head2)
    {
        LinkedList llist;
        Node curr1 = head1;
        Node curr2 = head2;
        while (curr1!=null && curr2!=null)
        {
            compare (curr1.data, curr2.data);
            llist.push(bigger);
            curr1= curr1.next;
            curr2= curr2.next;
        }
    }
    
    public int compare (int x, int y)
    {
        int bigger;
        if (x>y)
        {
            bigger = x;
        }
        else 
        {
            bigger = y;
        }
        return bigger;
    }
    
    
    
    
    
    
    
    void push(int new_data)
    {
        //make a new node 
        Node new_node = new Node(new_data);
        
        //make next of new node as head
        new_node.next = head;
        
        //make head point to new node
        head = new_node;
        
    }
    
    public  void printList()
    {
        Node tnode = head;
        while (tnode!=null)
        {
            System.out.println(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println("\n ");
    }
    
    
    public static void main(String[] args)
    {
        Node head1 = null; 
        Node head2 = null;
        
        //create a new linked list
        LinkedList llist1 = new LinkedList();
        LinkedList llist2 = new LinkedList();
        LinkedList llist3 = new LinkedList();
        
        //push items in it manually
        head1=llist1.push(9); 
        head2=llist2.push(8); 
        head2=llist2.push(7); 
        head1=llist1.push(6); 
        head1=llist1.push(5); 
        head2=llist2.push(4); 
        head1=llist1.push(3); 
        head2=llist2.push(2); 
        head1=llist1.push(1);
        
        System.out.println("Before Merging");
        llist1.printList();
        llist2.printList();
        

        mergeList(head1, head2);
        
        //System.out.println(head.next);
        System.out.println("After Merging");
        llist1.printList();
        llist2.printList();
        llist3.printList();
        
        
    }
    
}



