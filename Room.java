import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> listOfPersons;
    
    public Room(){
        this.listOfPersons = new ArrayList<>();
    }
    
    public void add(Person person){
        listOfPersons.add(person);
    }
    
    public boolean isEmpty(){
        if(listOfPersons.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return listOfPersons;
    }
    
      
    public Person shortest(){
        
        if(this.listOfPersons.isEmpty()){
            return null;
        }
        
        Person shortestPerson = this.listOfPersons.get(0);
      
        for(Person person:listOfPersons){
            
            if(shortestPerson.getHeight() > person.getHeight()){
                shortestPerson=person;
            }
        }          
        return shortestPerson;
    }
    
    
    public Person take(){
        if(this.listOfPersons.isEmpty()){
            return null;
        }
        
        Person personToTake = shortest();
        
        this.listOfPersons.remove(personToTake);
        
        return personToTake;
    }
  
}
