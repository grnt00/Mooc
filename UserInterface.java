import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private JokeManager jokemanager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokemanager, Scanner scanner){
        this.jokemanager = jokemanager;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true) {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");

        String command = scanner.nextLine();

        if (command.equals("X")) {
            break;
        } else if (command.equals("1")){
            System.out.println("Write the joke to be added: ");
            String input = scanner.nextLine();
            jokemanager.addJoke(input);
        } else if(command.equals("2")){
            System.out.println("Drawing jokes: ");
            jokemanager.drawJoke();
        } else if(command.equals("3")){
            System.out.println("Printing jokes: ");
            jokemanager.printJokes();
        }
    }
  }
}
