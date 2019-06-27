public class StackAsLinkedList
{
    StackNode root;
    
    class StackNode
    {
        int data;
        StackNode next;
        StackNode(int d)
        {
            data = d;
            next = null;
        }
    }
    
    public boolean isEmpty()
    {
        if (root == null)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public void push(int x)
    {
        StackNode new_node = new StackNode(x);
        
        if (root==null)
        {
            root = new_node;
        }
        else
        {
            StackNode temp = root;
            root = new_node;
            new_node.next = temp;
        }
        System.out.println(x + " pushed into the stack");
        
    }
    
    public void pop()
    {
        int temp1 = root.data;
        if (root == null)
        {
            System.out.println("STack underflow");
        }
        else 
        {
        root = root.next;
        System.out.println(temp1 + " popped from the stack" );
        }
    }
    
    
    public static void main(String args[])
    {
        StackAsLinkedList s = new StackAsLinkedList(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.pop();
    }
    
    
    
}
