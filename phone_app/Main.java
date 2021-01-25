import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Array list of different contract
    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    private static int id = 0;

    public static void main(String[] args) {
        /**
         * Simulate your phone's contacs and messages applications
         * 
         * Greet the user Show these 3 options: 1. Manage contacts 2. Messages 3. Quit
         * In case of selecting 1 --> show this options: 1. Show all contacts 2. Add a
         * new contact 3. Search for a contact 4. Delete a contact 5. Go back to
         * previous menu In case of selecting 2 --> show this options: 1. See the list
         * of all messages 2. Send a new message 3. Go back to previous menu In case of
         * 3 -0> Quit application
         * 
         */

        contacts = new ArrayList<>();
        System.out.println("Welcome to my contacts");

        // Show the options for the getting the contacts or showing messages
        showInitialOptions();
    }

    // Main options
    private static void showInitialOptions() {
        System.out.println("Please select one: " + "\n\t1. Manage Contacts" + "\n\t2. Messages" + "\n\t3. Quit");

        // Init the scanner
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;
        }
    }

    private static void manageContacts() {
        System.out.println("Please Select one: " + "\n\t1. Show all contacts" + "\n\t2. Add a new contact"
                + "\n\t3. Search for a contact" + "\n\t4 Delete a contact" + "\n\t5. Go back");

        // What the user selected in the choices
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showContacts();
                break;
            case 2:
                addContact();
                break;
            case 3:
                searchForContact();
                break;
            case 4:
                deleteContact();
                break;
            default:
                // Go back to original options meni
                showInitialOptions();
                break;
        }
    }

    private static void deleteContact() {
        System.out.println("Please enter the contact name");

        String deleteNameSearch = scanner.next();

        if (deleteNameSearch.equals("")) {
            System.out.println("Please enter the contact name");
            deleteContact();
        } else {
            boolean doesExist = false;

            // Foreach contacts as c
            for (Contact c : contacts) {
                if (c.getName().equals(deleteNameSearch)) {
                    doesExist = true;
                    contacts.remove(c);
                }
            }

            // If doesExist boolean is still false;
            if (!doesExist) {
                System.out.println("There's no such contact");
            }
        }

        showInitialOptions();
    }

    // Search contacts
    private static void searchForContact() {
        System.out.println("Please enter the contact name");

        String nameSearch = scanner.next();

        if (nameSearch.equals("")) {
            System.out.println("Please enter the contact name");
            // recursion again to start at the beginning of the func
            searchForContact();
        } else {

            boolean doesExist = false;

            // Foreach contacts as c
            for (Contact c : contacts) {
                if (c.getName().equals(nameSearch)) {
                    doesExist = true;
                    c.getDetails();
                }
            }

            // if the search for the contact not exist
            if (!doesExist) {
                System.out.println("The contact does not exist");
            }
        }

        showInitialOptions();

    }

    // Add new contact to the arraylist of contacts
    private static void addContact() {
        System.out.println("Adding a new contact..." + "\nPlease enter the contact's name:");
        ;
        String name = scanner.next();
        System.out.println("Please enter the contact's number");
        String number = scanner.next();
        System.out.println("Please enter the contact's email");
        String email = scanner.next();

        // Check if one of the field doesn't have inpui
        if (name.equals("") || number.equals("") || email.equals("")) {
            System.out.println("Please enter all of the information needed");
            // Recursion
            addContact();
        } else {

            // check if a contact does exist
            boolean doesExist = false;
            // Foreach contacts as c
            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }

            if (doesExist) {
                System.out.println("We have a contact named " + name + " saved on the phone");
                addContact();
            } else {
                // Create a new instance of contact
                Contact newContact = new Contact(name, number, email);

                // Add the new contact in the arraylist
                contacts.add(newContact);
                System.out.println("Contact added successfully");
            }

        }

        showInitialOptions();
    }

    // Show all the contacts - manageContacts()
    private static void showContacts() {
        //Check if there's a contact in the ArrayList
        if(contacts.size() > 0){
            // Foreach contacts as c
            for (Contact c : contacts) {
                c.getDetails();
                System.out.println("---------------");
            }

            showInitialOptions();
        }
        else{
            System.out.println("Contact is empty");
            manageContacts();
        }
    }

    private static void manageMessages() {
        System.out.println(
                "Please Select one: " + "\n\t1. Show all messages" + "\n\t2. Send a new message" + "\n\t3. Go back");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showMessages();
                break;
            case 2:
                sendNewMessage();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    // Methods in the manageMessages func
    private static void showMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();

        for (Contact c : contacts) {
            allMessages.addAll(c.getMessages());
        }

        // Check if the size of the messages is greater than 0
        if (allMessages.size() > 0) {
            // foreach allMessages as m
            for (Message m : allMessages) {
                m.getDetails();
                System.out.println("++++++++++++");
            }
        } else {
            System.out.println("You dont have any message");
        }
        showInitialOptions();
    }

    private static void sendNewMessage() {
        System.out.println("Who are you going to send a Message...");
        // Get the input name
        String name = scanner.next();

        //
        if (name.equals("")) {
            System.out.println("Please enter the name of the contact");
            sendNewMessage();
        } else {
            boolean doesExist = false;
            // foreach contacts as c
            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }

            if (doesExist) {
                System.out.println("What are your message");
                String text = scanner.next();

                if(text.equals("")){
                    System.out.println("Please enter some message");
                    sendNewMessage();
                }
                else {
                    id++;
                    Message newMessage = new Message(text, name, id);
                    for(Contact c: contacts) {
                        if(c.getName().equals(name)){
                            //Create a new instance of Message in ArrayList
                            ArrayList<Message> newMessages = c.getMessages();
                            newMessages.add(newMessage);
                            c.setMessages(newMessages);
                        }
                    }
                }

            } else {
                System.out.println("There's no such contact");
            }
        }

        showInitialOptions();
    }       
}
