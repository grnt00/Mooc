import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> oneItemBoxItemsList;
    
    public OneItemBox(){
        this.oneItemBoxItemsList = new ArrayList<>();
    }
    
    public void add(Item item){
        if(oneItemBoxItemsList.size() >= 1){
            return;
        } else {
            oneItemBoxItemsList.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        for(Item itemInBox : oneItemBoxItemsList){
            if(itemInBox.equals(item)){
                return true;
            } 
        }
            return false;
    }
    
}
