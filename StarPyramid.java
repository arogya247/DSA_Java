public class star{
    
    
    public static void main(String args[]){
        
        for (int row=1;row<6;row++){
            
            for (int blank=1;blank<6-row;blank++){
            System.out.print(" ");
            }
            
            for (int star=1;star<row+1;star++){
                System.out.print("*");
            }
    
            System.out.println("\n");
        }
        
        
    }
    
}
