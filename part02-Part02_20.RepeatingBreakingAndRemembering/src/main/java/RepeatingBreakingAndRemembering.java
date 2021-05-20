
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
                
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            if (input % 2 == 0) {
                evenCount = evenCount +1;
            } else {
                oddCount = oddCount +1;
            }
            sum = sum + input;
            count = count + 1;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((float) sum / count));
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
