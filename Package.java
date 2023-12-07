import java.util.ArrayList;

public class Package {
    
    //private int totalWeight;
    private ArrayList<Gift> listOfGifts = new ArrayList<>();
    
    public Package(){
        
    }
    
    
    public void addGift(Gift gift){
        listOfGifts.add(gift);
        //this.totalWeight += gift.getWeight();
        
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for(int i = 0; i < listOfGifts.size(); i++){
            totalWeight += listOfGifts.get(i).getWeight();
        }
        
        return totalWeight;
    }
    
    
    
    
}
