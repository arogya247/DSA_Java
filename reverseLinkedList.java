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
    
    
    public void reverse()
    {
      Node next = null, prev=null, curr = head;
      //while (curr.next!=null)     ------> why this is wrong
      while (curr!=null)
      {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;  
      }
      head = prev;
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
        
        //create a new linked list
        LinkedList llist = new LinkedList();
        
        //push items in it manually
        llist.push(7); 
        llist.push(6); 
        llist.push(5); 
        llist.push(4); 
        llist.push(3); 
        llist.push(2); 
        llist.push(1);
        
        System.out.println("Before Reversing");
        llist.printList();
        
        llist.reverse();
        
        //System.out.println(head.next);
        System.out.println("After Reversing");
        llist.printList();
        
        
    }
    
}



