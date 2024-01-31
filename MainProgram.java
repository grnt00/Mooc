import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] array2 = {-1, 3, 1, 2};
        int[] array3 = {-1, 3, 1, 7, 4, 5, 2, 4, 3};
        int[] arrayTest = {6, 3, 0, -1, 4};
     
       // System.out.println("Smallest: " + MainProgram.smallest(array));
        //System.out.println("Index of the smallest: " + MainProgram.indexOfSmallest(array));
        //System.out.println("Index of the smallest for: " + MainProgram.indexOfSmallestFrom(array2, 2));
        //System.out.println("");
        //System.out.println("Smallest arrayTest: " + MainProgram.smallest(arrayTest));
        //int[] numbers = {3, 2, 5, 4, 8};

        //System.out.println(Arrays.toString(numbers));

        //MainProgram.swap(numbers, 1, 0);
        //System.out.println(Arrays.toString(numbers));

        //MainProgram.swap(numbers, 0, 3);
        //System.out.println(Arrays.toString(numbers));
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

            
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
        int tempArrayStartIndex = 0;
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
        
        for(int i = 0; i < table.length; i++){
            if(table[i] == smallest(tempArray)){          
                indexOfSmallestFrom = i;
            } 
        } return indexOfSmallestFrom;     
    }
    
    public static void swap(int[] array, int index1, int index2){
        int tempValue1 = 0;
        int tempValue2 = 0;
        int index1Value = array[index1];
        int index2Value = array[index2];
        
        for(int i = 0; i < array.length; i++){
            if(i == index1){
                tempValue1 = array[i];
                array[index1] = tempValue1;
            } else if (i == index2){
                tempValue2 = array[i];
                array[index2] = tempValue2;
            }
         }
            array[index1] = tempValue2;
            array[index2] = tempValue1;   
        }
    
    public static void sort(int[] array){
        int tempSmallest = 0;
        int tempSmallestIndex = 0;
        int tempCurrentIndex = 0;
        //int[] tempArray = new int[array.length];
        
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            tempCurrentIndex = i;
            tempSmallest = smallest(array);
            tempSmallestIndex = indexOfSmallestFrom(array, i);
            System.out.println(smallest(array));
            System.out.println(indexOfSmallestFrom(array, i));
            swap(array, tempCurrentIndex, tempSmallestIndex);
            
        }
        
    }
    
    }
        

