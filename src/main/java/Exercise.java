
public class Exercise {
    
    private String name;
    private Boolean completed;
    
    public Exercise(String name){
        this.name = name;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
    
    public boolean isCompleted(){
        return completed;
    }
    
}
