//java program to impolement selection sort 


public class selectionsort{
    
    public static int[] selsort(int arr[]){
        
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            
            // Find the minimum element in unsorted array 
            //min idx will be incremented by 1 for every round
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    min_idx = j;
            
            //swap the elements after finding the lowest key        
            int temp;        
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
                }
                
            }
            
        }
        
        return arr;    
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
        
        selectionsort obj = new selectionsort();
        int arr1[] = {64,25,13,22,11};
        printArray(arr1);
        obj.selsort(arr1);
        printArray(arr1);
    }
    
}
