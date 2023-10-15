import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack = new ArrayList<>();
    
    public void Stack(){
        this.stack = stack;
    }
    
    
    public boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        } else {
           return false;
        }
    }
    
    public void add(String value){
        stack.add(value);  
    }
    
    public ArrayList<String> values(){
       return (stack);
    }
    
    public String take(){
        
      return stack.remove(stack.size() -1);
    }
}
