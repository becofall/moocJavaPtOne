
import java.util.Scanner;


public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        
        while (true) {
           System.out.println("Command: ");
            String input = scanner.nextLine();
        
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            
            } else if (input.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Tranlation: ");
                String translation = scanner.nextLine();
                
                this.simpleDictionary.add(word, translation);
            
            } else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String inputToBeTranslated = scanner.nextLine();
                String translation = simpleDictionary.translate(inputToBeTranslated);
                if (translation == null){
                    System.out.println("Word " + inputToBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }   
            } else {
                System.out.println("Unknown command");
            }    
        }
        
    }
}
