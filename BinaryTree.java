/* Class containing left and right child of current 
   node and key value*/
class Node{
    
    int key;
    Node left,right;
    
    public Node(int item){
        key = item;
        left = right = null;
    }
}

//a java program to make a simple binary tree
public class BinaryTree{
    
    Node root;
    
    //constructors
    BinaryTree(int key){
        root = new Node(key);
    }
    
    BinaryTree(){
        root = null;
    }
    
    public static void main(String args[]){
        
        BinaryTree tree = new BinaryTree();
        
        //create root
        tree.root = new Node(1);
        
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        
        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2 
                    1 
                /       \ 
               2          3 
             /   \       /  \ 
            4    null  null  null 
           /   \ 
          null null 
         */
    }
    
}
