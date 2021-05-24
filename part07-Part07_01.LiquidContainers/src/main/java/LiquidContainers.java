
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            //split input string
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            //add amount
            if (command.equals("add")) {
                if (first + amount >= 100) {
                    first = 100;
                } else if (amount > 0) {
                    first = first + amount;
                }
            }
            
            //move amount
            if (command.equals("move")) {
                if (amount > first) {
                    amount = first;
                }
                if (second + amount >=100) {
                    second = 100;
                    first = first - amount;
                } else {
                    second = second + amount;
                    first = first - amount;
                }
            }
            
            //remove amount
            if (command.equals("remove")) {
                if (amount > second) {
                    second = 0;
                } else {
                    second = second - amount;
                }
            }
        }
    }

}
