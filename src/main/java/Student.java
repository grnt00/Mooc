
public class Student extends Person {
    
    protected int creditsAmount;
    
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
    
}
