public class LinkedList
{
    static Node head, head1, head2;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    void splitlist()
    {
        Node slow_ptr = head;
        Node fast_ptr = head;
        
        if (head==null)
        return;
        
        do 
        {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        while(fast_ptr.next!=head && fast_ptr.next.next!=head);
        
        //if size of list is even
        if (fast_ptr.next.next == head)
        {
            fast_ptr = fast_ptr.next;
        }
        
        //set the head pointer of the first list 
        head1 = head;
        
        //set the head pointer of the second half
        if (head.next!=head)
        {
            head2 = slow_ptr.next; 
        }    
        
         // Make second half circular 
        fast_ptr.next = slow_ptr.next; 
  
        // Make first half circular 
        slow_ptr.next = head;
        
    }
    
    void printlist(Node node)
    {
        Node temp = node;
        if (node!=null)
        {
            do { 
                System.out.print(temp.data + " "); 
                temp = temp.next; 
            } while (temp != node);
        }
    }
    
    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); 
  
        //Created linked list will be 12->56->2->11 
        list.head = new Node(12); 
        list.head.next = new Node(56); 
        list.head.next.next = new Node(2); 
        list.head.next.next.next = new Node(11); 
        list.head.next.next.next.next = list.head; 
  
        System.out.println("Original Circular Linked list "); 
        list.printlist(head); 
  
        // Split the list 
        list.splitlist(); 
        System.out.println(""); 
        System.out.println("First Circular List "); 
        list.printlist(head1); 
        System.out.println(""); 
        System.out.println("Second Circular List "); 
        list.printlist(head2); 
          
    }
    
    
}
