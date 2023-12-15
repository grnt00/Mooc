import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    TodoList toDoList;
    
    public UserInterface(TodoList toDoList, Scanner scanner){
        this.toDoList = toDoList;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            } else if(command.equals("add")){
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                this.toDoList.add(toAdd);
            } else if (command.equals("list")){
                this.toDoList.print();
            } else if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.toDoList.remove(toRemove);
            }
        }
        
    }
    
    
}
