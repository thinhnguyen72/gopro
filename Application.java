import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        AddressBooks addressBooks = new AddressBooks();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addressBooks.addContact();
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    addressBooks.findContactByName(name);
                    break;
                case 3:
                    addressBooks.displayContacts();
                    break;
                case 4:
                    System.out.println("Exiting.");
                    break;
            }
        } while (option != 4);
    }
}

