
public class AdvancedAstrology {

    public static void printStars(int number) {
        int starNumber = 1;
        while (starNumber <= number) {
            System.out.print("*");
            starNumber++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        int spaceNumber = 1;
        while (spaceNumber <= number) {
            System.out.print(" ");
            spaceNumber++;
        }
    }

    public static void printTriangle(int size) {
        int space = size - 1;
        int star = 1;
        while (space <= size && star <= size) {
            printSpaces(space);
            printStars(star);
            star++;
            space--;
        }
    }

    public static void christmasTree(int height) {
        int space = height - 1;
        int star = 1;
        while (space <= height && star <= height*2) {
            printSpaces(space);
            printStars(star);
            star = star + 2;
            space--;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
