import java.util.ArrayList;
import java.util.Scanner;

public class AddressBooks {
    private ArrayList<Contact> contacts;

    public AddressBooks() {
        contacts = new ArrayList<>();
    }

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter company: ");
        String company = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(name, company, email, phoneNumber);
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void findContactByName(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Phone number: " + contact.getPhoneNumber());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void displayContacts() {
        System.out.println("Address Book:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Company: " + contact.getCompany());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Phone number: " + contact.getPhoneNumber());
            System.out.println("---------------------");
        }
    }
}

