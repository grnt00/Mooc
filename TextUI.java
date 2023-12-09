import java.util.Scanner;

public class TextUI {
    
    private Scanner scanner = new Scanner(System.in);
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        
        while(true){
        System.out.print("Command: ");
        String command = scanner.nextLine();
        
        if(command.equals("end")){
            System.out.println("Bye bye!");
            break;
        } else if(command.equals("add")){
            System.out.print("Word: ");
            String word = scanner.nextLine();
            System.out.print("Transaltion: ");
            String translation = scanner.nextLine();
            dictionary.add(word, translation);
            
        } else {
            System.out.println("Unknown command");
        }     
      }        
    }
        
}
