//java program to impolement selection sort 


public class bubblesort{
    
    public static void bubsort(int arr[]){
        
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                
                //swap elements    
                int temp;        
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
        
                }
                
            }
            
        }
    }
    
    // Prints the array 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
    
    public static void main(String args[]){
        
        bubblesort obj = new bubblesort();
        int arr1[] = {64,25,13,22,11};
        printArray(arr1);
        obj.bubsort(arr1);
        printArray(arr1);
    }
    
}
