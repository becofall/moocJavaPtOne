
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numOfNums = 0;
        int sumOfNums = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int numInput = Integer.valueOf(scanner.nextLine());
            
            if (numInput == 0) {
                break;
            }
            
            numOfNums  = numOfNums + 1;
            sumOfNums = sumOfNums + numInput;
            
        }
        
        System.out.println("Number of numbers: " + numOfNums);
        System.out.println("Sum of the numbers: " + sumOfNums);

    }
}
