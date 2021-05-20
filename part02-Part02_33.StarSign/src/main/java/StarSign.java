
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);
        
        System.out.println("\n---");  // printing --- between the shapes
        
        printSquare(4);
       
        System.out.println("\n---");
        
        printRectangle(17, 3);
        
        System.out.println("\n---");
        
        printTriangle(4);
        
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int starNumber = 1;
        while (starNumber <= number) {
            System.out.print("*");
            starNumber++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int rows = 1;
        while (rows <= size) {
            printStars(size);
            rows++;
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        int i = 1;
        while (i <= height) {
            printStars(width);
            i++;
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        int a = 1;
        
        while (a <= size) {
            printStars(a);
            a++;
        }
        System.out.println("");
    }
}
