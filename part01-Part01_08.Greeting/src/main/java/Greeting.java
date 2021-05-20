
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name?");
        
        //user writes message
        String message = scanner.nextLine();
        
        //print user and system message
        System.out.println("Hi " + message);
      

    }
}
