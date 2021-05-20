
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float positive = 0;
        float count = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            if (input > 0) {
                positive = positive + input;
                count = count + 1;
            }
       
        }
        
        if (positive > 0) {
            System.out.println(positive / count);
            
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
