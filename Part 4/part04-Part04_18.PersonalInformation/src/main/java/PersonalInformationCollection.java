
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("First Name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()){
                break;
            }
            System.out.println("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.println("Identification number: ");
            String id = scanner.nextLine();
            
            //Adding the collected details into the list
            infoCollection.add(new PersonalInformation(firstName,lastName,id));
            System.out.println();
        }    
            //Printing the info:
            for (PersonalInformation personalInformation: infoCollection) {
                System.out.println(personalInformation.getFirstName() + ' ' + personalInformation.getLastName());
            }
    }
}
