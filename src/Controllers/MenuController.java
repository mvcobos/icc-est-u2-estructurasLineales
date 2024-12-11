package Controllers;

import Models.*;
import Views.ConsoleView;

public class MenuController {

    private ContactManager contactManager;
    private ConsoleView consoleView;
    
    
    public MenuController(ContactManager contactManager, ConsoleView consoleView) {
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView();
    }

    public void showMenu(){
        boolean exit = false;
        while(!exit){
            consoleView.displayMenu();
            String option = consoleView.getInput("");
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    exit = true;
                    consoleView.showMessage("Exiting .......");
                    break;
                default:
                    consoleView.showMessage("Invalid option.");
                    break;
            }
        }
    }

    private void addContact(){
        String name = consoleView.getInput("Enter name: ");
        String phone = consoleView.getInput("Enter phone");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contact added");
    }   

    private void findContact(){
        String name = consoleView.getInput("Enter a name to search: ");
        Contact<?, ?> contact = contactManager.findContactByName(name);

        if (contact != null){
            consoleView.showMessage("Contact found: " + contact);
        } else {
            consoleView.showMessage("Contact not found 404");
        }
    }

    private void deleteContact(){
        String name = consoleView.getInput("Enter a name to delete: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("Contact deleted if existed");  
    }

    private void printList(){
        contactManager.printM();
    }

    public ContactManager getContactManager() {
        return contactManager;
    }

    public void setContactManager(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    public ConsoleView getConsoleView() {
        return consoleView;
    }

    public void setConsoleView(ConsoleView consoleView) {
        this.consoleView = consoleView;
    }
}
