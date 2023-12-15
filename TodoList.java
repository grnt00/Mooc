import java.util.ArrayList;

public class TodoList {
    
    private String task;
    private int number;
    private ArrayList<String> taskList;
    
    public TodoList(){
        this.taskList = new ArrayList<>();
    }
    
    public void add(String task){
        this.task = task;
        if(!taskList.contains(task)){
            taskList.add(task); 
        }else{
            System.out.println("This task is already on the list");
        }       
    }
    
    public void print(){
        for(int i = 0; i < taskList.size(); i++){
            System.out.println(i+1 + ": " + taskList.get(i));           
        }
    }
    
    public void remove (int number){
        this.number = number;
        taskList.remove(number-1);          
    }
    
}
