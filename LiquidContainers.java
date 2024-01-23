
import java.util.Scanner;

public class LiquidContainers {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int firstContainer = 0;
        int secondContainer = 0;
        
        while (true) {
            
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            

            
            if (input.equals("quit")) {
                break;
                
            } else {
                 String[] parts = input.split(" ");
                 String command = parts[0];
                 int amount = Integer.valueOf(parts[1]);
                 
                 if(command.equals("add")){
                     if(amount < 0){
                            continue;
                        } 
                     firstContainer += amount;
                     if(firstContainer > 100){
                     firstContainer = 100;
                     }
                } else if (command.equals("move")){
                    if(firstContainer < amount){
                        secondContainer += firstContainer;
                        firstContainer = 0;
                        System.out.println("test");
                    } else {
                        firstContainer -= amount;
                        secondContainer += amount;
                    } 
                    
                    if (secondContainer > 100){
                      secondContainer = 100;
                      
                } else if (command.equals("remove")){
                        System.out.println("test");
                    if(amount < 0){
                            continue;
                        }
                    secondContainer -= amount;
                    if(secondContainer < amount){
                    secondContainer = 0;
                }
              }       
            }
          }  
        } 
      }
    } 
        

