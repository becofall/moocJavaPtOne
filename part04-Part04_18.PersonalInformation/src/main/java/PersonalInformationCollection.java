
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("First name:");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            System.out.println("Last name:");
            String lastName = scanner.nextLine();
            
            System.out.print("Identification number:");
            String idNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }
        for (PersonalInformation personalinformation : infoCollection) {
            System.out.println(personalinformation.getFirstName() + " " + personalinformation.getLastName());
        }
    }
}


