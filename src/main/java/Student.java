
public class Student extends Person {
    
    private int creditsAmount;
    
    public Student(String name, String address){
        super(name, address);
        this.creditsAmount = 0;
    }
    
    public void study(){
        this.creditsAmount += 1;
    }
    
    public int credits(){
        return creditsAmount;
    }
    
    public String toString(){
        return super.toString() + "\n" + "  Study credits " + credits();
    }
    
}
