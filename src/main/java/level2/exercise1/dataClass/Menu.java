package level2.exercise1.dataClass;

import level2.exercise1.logic.BuilderFactory;
import java.util.Scanner;

public class Menu {
    private final InternationalAddressBook agenda = new InternationalAddressBook();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        int option;
        do {
            option = showMenu();
            handleOption(option);
        } while (option != 3);
    }

    private int showMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Enter contact");
        System.out.println("2. Show international contacts");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    private void handleOption(int option) {
        scanner.nextLine();

        switch (option) {
            case 1 -> addContact();
            case 2 -> showContacts();
            case 3 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid option");
        }
    }

    private void addContact() {
        System.out.println("\n--- Enter contact ---");
        System.out.print("Country (spain/usa/japan): ");
        String country = scanner.nextLine();

        System.out.print("Telephone: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Address: ");
        String addressData = scanner.nextLine();

        try {
            BuilderFactory builder = new BuilderFactory(country);
            Contact contact = builder.buildContact(phoneNumber, addressData);
            agenda.addContact(contact);
            System.out.println("Contact added successfully!");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private void showContacts() {
        System.out.println("\n--- Contacts ---");
        if (agenda.getContacts().isEmpty()) {
            System.out.println("No contacts available");
        } else {
            agenda.showContacts();
        }
    }
}