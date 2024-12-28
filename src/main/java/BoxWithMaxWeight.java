import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> maxWeightBoxItemsList;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.maxWeightBoxItemsList = new ArrayList<>();
    }
    
    public void add(Item item){
        int balance = 0;
        for(Item itemInBox : maxWeightBoxItemsList){
            balance += itemInBox.getWeight();
        }
                
        if(item.getWeight() + balance > this.capacity){
            return;
        }
            maxWeightBoxItemsList.add(item);
    }
    
    public boolean isInBox(Item item){
        for(Item itemInBox : maxWeightBoxItemsList){
            if(itemInBox.equals(item)){
                return true;
            }
        }
            return false;
    }
   

}
