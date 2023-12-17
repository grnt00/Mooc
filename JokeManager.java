import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokesList;
    //private Scanner scanner;
    
    public JokeManager(){
        this.jokesList = new ArrayList<>();
        //this.scanner = new Scanner(System.in);
    }
    
    public void addJoke(String joke){
        //joke = scanner.nextLine();
        jokesList.add(joke);
    }
    
    public String drawJoke(){
        if (jokesList.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokesList.size());
            return jokesList.get(index);
        }   
    }
    
    public void printJokes(){
        for (String joke : jokesList) {
            System.out.println(joke);
        }
    }
}
