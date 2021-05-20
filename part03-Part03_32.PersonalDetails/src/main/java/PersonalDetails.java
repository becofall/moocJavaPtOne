
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int largest = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
            
            if (largest < parts[0].length()) {
                largest = parts[0].length();
                name = parts[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double)sum/count);
    }
}
