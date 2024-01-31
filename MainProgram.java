
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] array2 = {-1, 3, 1, 2};
        int[] array3 = {-1, 3, 1, 7, 4, 5, 2, 4, 3};
        int[] arrayTest = {6, 3, 0, -1, 4};
     
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest: " + MainProgram.indexOfSmallest(array));
        System.out.println("Index of the smallest for: " + MainProgram.indexOfSmallestFrom(array2, 2));
        System.out.println("");
        System.out.println("Smallest arrayTest: " + MainProgram.smallest(arrayTest));

            
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        int temp = 0;
       
        for(int i = 0; i < array.length;i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        } return smallest;
        
    } 
    
    
    public static int indexOfSmallest(int[] array){
        int indexOfSmallest = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == smallest(array)){          
                indexOfSmallest = i;
            }
        } return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int tempTableSize = 0;
        int indexOfSmallestFrom = 0;
        //int tempValue = 0;
        int tempArrayStartIndex = 0;
        int smallestOfTempArray = 0;
        //finding tempTable length and copying value from table, starting from
        //given startIndex (to avoid 0's in indicies before startIndex)
        for(int i = startIndex; i < table.length; i++){
            tempTableSize++;
        }
        int[] tempArray = new int [tempTableSize];
        
        //copying values to tempArray 
        for(int i = startIndex; i < table.length; i++){
            tempArray[tempArrayStartIndex] = table[i];
            tempArrayStartIndex++;   
        }       
        
        //test print of tempArray values
        for(int i = 0; i<tempArray.length;i++){
            System.out.println(tempArray[i]);
            }
        

        for(int i = 0; i < table.length; i++){
            if(table[i] == smallest(tempArray)){          
                indexOfSmallestFrom = i;
            }
        
        
        }return indexOfSmallestFrom;
        
    
    }
    

}
