class Node{
    int key;
    Node left,right;
    
    public Node(int item){
        key = item;
        left = right = null;
    }
}


public class BinaryTree{
     Node root;
    
    BinaryTree(){
        root = null;
    }
    
    //postorder traversal method
    void printpostorder(Node node){
        
        if (node==null){
            return;
        }
        
        //recur on the left subtree
        printpostorder(node.left);
        
        //recur on the right subtree
        printpostorder(node.right);
        
        //now print the value of the node 
        System.out.println(node.key + " ");
        
    }
    
    void printpreorder(Node node){
        
        if(node==null){
            return;
        }
        
        System.out.println(node.key +" ");
        
        printpreorder(node.left);
        
        printpreorder(node.right);
        
        
    }
    
    //wrapper
    void printpostorder(){
        printpostorder(root); 
    }
    void printpreorder(){
        printpreorder(root);
    }
    
    
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        
        System.out.println("Postorder: ");
        tree.printpostorder();
        
        System.out.println("Preorder: ");
        tree.printpreorder();
        
    } 
 
}
