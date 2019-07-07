public class star{
    
    
    static int num,k=1,row,blank,star;
    
    static void pyramid(int n){
    for (row=1;row<n;row++){
            
            for (blank=1;blank<n-row;blank++){
            System.out.print("  ");
            }
            
            for (star=1;star<row+1;star++){
                num = (2*k*(4*k-1));
                System.out.print(num+" ");
                k++;
            }
            
            System.out.println("\n");
        }
        
    }
    
    
    public static void main(String args[]){
        
        pyramid(5);
    }
    
}
