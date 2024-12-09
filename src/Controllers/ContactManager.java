package Controllers;
import Models.*;

public class ContactManager {
    private LinkedList<Contact<?,?>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact){
        contacts.appendToTail(contact);
    }


    
}
