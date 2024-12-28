import java.util.ArrayList;

public class MisplacingBox extends Box {
    ArrayList<Item> misplacedBoxesList;
    
    public MisplacingBox(){
        this.misplacedBoxesList = new ArrayList<>();
    }
    
    public void add(Item item){
        this.misplacedBoxesList.add(item);
    }
    
    public boolean isInBox(Item item){
        return false;
    }
    
}
