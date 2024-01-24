
public class Container {
    int currentVolume;
    
    
    public Container(){
        this.currentVolume = currentVolume;
    }
    
    public int contains(){
        return currentVolume;
    }
    
    public void add(int amount){
        if(amount > 0){
            currentVolume += amount;
            if(currentVolume > 100){
                currentVolume = 100;
            }
        }
    }
    
    public void remove (int amount){
        if(amount > 0){
            currentVolume -= amount;
            if(currentVolume < 0){
                currentVolume = 0;
            }
        }
    }
    
    public String toString(){
        return currentVolume + "/100";
    }
    
}
