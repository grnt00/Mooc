import java.util.ArrayList;

public class Hold {
    
    private int maximumWeight;
    private ArrayList<Suitcase> holdList;
    private int holdTotalWeight;
    
    
    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.holdList = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
         if((this.holdTotalWeight + suitcase.totalWeight()) <= this.maximumWeight){
            this.holdList.add(suitcase);
            this.holdTotalWeight += suitcase.totalWeight();
        }   
    }
    
    public void printItems(){
        for(Suitcase suitcase:holdList){
            suitcase.printItems();
        }
        
    }
    
    public String toString(){
        return this.holdList.size() + " suitcases " + "(" +
                holdTotalWeight + "kg)";
    }
    
}
