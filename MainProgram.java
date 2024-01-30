
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
     
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest: " + MainProgram.indexOfSmallest(array));
            
    }
    
    public static int smallest(int[] array){
        int temp = array[0];
        int smallestNumber = 0;
        for(int i = 1; i < array.length; i++){   
            if(array[i] < temp){
                temp = array[i];
                smallestNumber = temp;
            }           
        } return smallestNumber;
    }
    
    public static int indexOfSmallest(int[] array){
        int indexOfSmallest = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == smallest(array)){          
                indexOfSmallest = i;
            }
        } return indexOfSmallest;
    }

}
