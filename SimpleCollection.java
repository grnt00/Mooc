
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String printOutput = "The collection " + this.name + " has " + this.elements.size() +
                " elements: " + this.elements;
        
        String elementsName = "";
        
        //for(String element: elements){
        //    elementsName = elementsName + getElements() + "\n";
        //}
        
        for(int i = 0; i < elements.size(); i++){
            elementsName = elementsName + this.elements.get(i) + "\n";
            
            if(elements.size() == 1){
                elementsName = this.elements.get(i);
            }
        }
        
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        if(this.elements.size() == 1){
            return "The collection " + this.name + " has 1 element:\n" + elementsName;
        }
        
        return "The collection " + this.name + " has " + this.elements.size() + " elements:\n"
               + elementsName;
        
    }
    
}
