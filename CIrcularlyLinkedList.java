public class GFG
{
    static class Node
    {
        int data;
        Node next;
    };
    
    
    //add to empty list 
    public static Node addtoempty(Node last, int data)
    {
        //this function is only for empty list 
        if (last!=null)
        return last;
        
        //creating a new node dynamically 
        Node temp = new Node();
        
        temp.data = data;
        last = temp;
        
        //creating the link from last to first 
        last.next = last;
        
        return last;
    }
    
    
    //add to beginning of list 
    public static Node addtobegin(Node last, int data)
    {
        //check if list is emty or not
        if (last==null)
        return addtoempty(last, data);
        
        //creating a new node dynamically 
        Node temp = new Node();
        
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        
        return last;
        
    }
    
    //add to end 
    public static Node addtoend(Node last, int data)
    {
        //check if last is empty
        if (last==null)
        return addtoempty(last, data);
        
        Node temp = new Node();
        
        temp.data = data; 
        temp.next = last.next; 
        last.next = temp; 
        last = temp;
        
        return last;
    }
    
    //add in between
    public static Node addafter(Node last, int data, int item)
    {
        if (last==null)    
        return null;
        
        Node p, temp;
        p = last.next;
        do 
        {
            if(p.data==item)
            {
                temp=new Node();
                temp.data = data;
                temp.next = p.next;
                p.next = temp;
                
                if (p==last)
                last=temp;
                return last;
            }
            p=p.next;
        }while(p != last.next); 
        
        System.out.println(item + "not present in the list");
        return last;
        
    }
    
    public static void traverse(Node last)
    {
        Node p;
        
        //check if list is empty or not
        if (last==null)
        {
            System.out.println("List is empty");
        }
        
        //pointing to first node of the list 
        p=last.next;
        
        //traverse
        do
        {
            System.out.println(p.data + " ");
            p=p.next;
        }
        while(p!=last.next);
        
    }
    
    //Driverr code
    public static void main(String[] args)
    {
        Node last = null;
        
        last = addtoempty(last,6);
        last = addtobegin(last,8);
        last = addtoend(last,5);
        last = addtobegin(last,1);
        last = addtobegin(last,2);
        last = addtoend(last,4);
        last = addafter(last, 3, 6);
        last = addafter(last, 7, 5);
        
        
        traverse(last);
        
        
    }
    
}
