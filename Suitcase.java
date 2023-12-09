import java.util.ArrayList;

public class Suitcase {
    
    private int weightLimit;
    private ArrayList<Item> suitcaseList;
    private int totalWeight;
    
    public Suitcase(int weightLimit){
        this.weightLimit = weightLimit;
        this.suitcaseList = new ArrayList<>();
      
    }
    
    public void addItem(Item item){
        if((this.totalWeight + item.getWeight()) <= this.weightLimit){
            this.suitcaseList.add(item);
            totalWeight += item.getWeight();
        }     
    }
    
     public void printItems(){
        for(Item item:this.suitcaseList){
            System.out.println(item.toString());
        }
    }
     
    public int totalWeight(){
        return this.totalWeight;
    }
    
    @Override
    public String toString(){
        if(suitcaseList.isEmpty()){
            return "no items " + "(" + this.totalWeight + "kg)";
        } else if (suitcaseList.size() == 1){
            return suitcaseList.size() + " item " + "(" + this.totalWeight + "kg)";
        }
        return suitcaseList.size() + " items " + "(" + this.totalWeight + "kg)"; 
    }
    
       
}
