import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainActivity mainActivity = new MainActivity();
        Scanner sc = new Scanner(System.in);

        String choice;

        do {
            System.out.println("\nM E N U");
            System.out.println("1: Add a Person");
            System.out.println("2: Display Persons");
            System.out.println("3: Search a Person");
            System.out.println("4: Update a Person");
            System.out.println("5: Remove a Person");

            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextLine();

            switch (choice) {

                case "1":
                    mainActivity.addPerson();
                    break;
                case "2":
                    mainActivity.displayPersons();
                    break;

                case "3":
                    mainActivity.searchPersons();
                    break;

                case "4":
                    mainActivity.updatePerson();
                    break;

                case "5":
                    mainActivity.remvePerson();
                    break;

                case "0":
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("0"));
    }
}