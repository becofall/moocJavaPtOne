

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);
    }
    
    public static void printFromNumberToOne(int number) {
        int i = 1;
        while (i >= 1) {
            if (number < 1) {
                break;
            }
            System.out.println(number);
            number = number - 1;
        }
    }

}
