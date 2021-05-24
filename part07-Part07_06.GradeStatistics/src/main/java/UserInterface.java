
import java.util.Scanner;


public class UserInterface {
    
    private Points points;
    private Scanner scanner;
    
    public UserInterface(Scanner scanner, Points points) {
        this.points = points;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stop: ");
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("-1")) {
                break;
            }
            int inputAsInt = Integer.parseInt(input);
            if(inputAsInt >= 50) {
                points.addToPassingArray(inputAsInt);
                points.addToArray(inputAsInt);
            } else {
                points.addToArray(inputAsInt);
            }
        }
        System.out.println("Point average (all): " + points.averagePoints());
        if(points.passingTotalPoints() == 0) {
            System.out.println("Points average (passing): -");
        } else {
            System.out.println("Point average (passing): " + points.averagePassingPoints());
        }
        System.out.println("Pass percentage: " + points.passPercentage());
        System.out.println(points.passingTotalPoints());
        System.out.println(points.totalPoints());
        
        System.out.println("Grade distribution:");
        points.pointsToGrade();
    }
}
