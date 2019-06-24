public class LinkedList{

  Node head;
  
  class Node
  {
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next= null;
    }
  }
  
  
  public void swap_nodes(int x, int y)
  {
      //if x and y are equal
      if (x==y) return;
      
      //search for x nd keep of track of previous node 
      Node currX=head, prevX=null;
      while (currX.data!=x && currX!=null)
      {
          prevX = currX;
          currX = currX.next;
      }
      
      //search for y and keep track of previous node
      Node currY=head, prevY=null;
      while (currY.data!=y && currY!=null)
      {
          prevY=currY;
          currY=currY.next;
      }
      
      //if there exists no x or y
        //if (currX==null || currY==null) 
            //return;
      
      
    
      
      // If x is not head of linked list 
        if (prevX != null) 
            prevX.next = currY; 
        else //make y the new head 
            head = currY; 
  
        // If y is not head of linked list 
        if (prevY != null) 
            prevY.next = currX; 
        else // make x the new head 
            head = currX;
            
            
      //swap the pointers
      Node temp = currX.next;
      currX.next = currY.next;
      currY.next = temp;
      
  }
  
  
   
 
  void push(int new_value)
  {
      //make a new node
      Node new_node = new Node(new_value);
      
      //Make next of new_node as head
      new_node.next = head;
      
      //point head to the new_node
      head = new_node;
  }


  //function to print the contents of linked list 
  public void printList()
  {
      Node tnode = head;
      while (tnode!=null)
      {
          System.out.println(tnode.data + " ");
          tnode = tnode.next;
      }
  }



     public static void main(String []args)
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
        
        //Print List before swap
        System.out.println("Before Swapping");
        llist.printList();
        
        //swap any 2 items
        try
        { 
            llist.swap_nodes(1,8);
        }
        
        catch (NullPointerException e) { 
            System.out.println("\nElement is not present in the list\n"); 
        } 
        //Print List after swap
        System.out.println("After Swapping");
        llist.printList();
        
        
     }
}










