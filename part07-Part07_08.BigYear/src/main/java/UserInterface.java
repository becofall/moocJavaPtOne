
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    
    private Scanner scanner;
    private BirdDatabase birdDatabase;

    public UserInterface(Scanner scanner, BirdDatabase birdDatabase) {
        this.scanner = scanner;
        this.birdDatabase = birdDatabase;
    }

  
    public void startUserInterface() {
        //System.out.print("? ");
        
        
        while(true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            
            if(input.equals("Quit")) {
                break;
            }
            
            if(input.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                birdDatabase.add(name, latinName);
            }
            
            if(input.equals("Observation")) {
                System.out.print("Bird? ");
                String birdInput = scanner.nextLine();
                boolean foundBird = birdDatabase.observation(birdInput);
                if(!foundBird) {
                    System.out.println(birdInput + " is not a bird!");
                }
            }
            
            if(input.equals("All")) {
                birdDatabase.printBirds();
            }
            
            if(input.equals("One")) {
                System.out.print("Bird? ");
                String birdInput = scanner.nextLine();
                birdDatabase.printBird(birdInput);
            }
           
        }
            
        
    }
    
    
}
