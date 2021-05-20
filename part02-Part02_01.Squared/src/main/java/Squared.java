
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type an integer:");
        int number = Integer.valueOf(scanner.next());
        
        int product = number * number;
        
        System.out.println(product);             
              

    }
}
