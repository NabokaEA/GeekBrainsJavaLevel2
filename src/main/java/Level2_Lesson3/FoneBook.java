package Level2_Lesson3;

import java.util.ArrayList;

public class FoneBook {
ArrayList<Contact> foneBook =new ArrayList<>();
    public void Add(Contact contact) {
        foneBook.add(contact);
    }

    public void Get(String lastName) {
        for (Contact contact : foneBook) {
            if (contact.getLastName() == lastName) {
                System.out.println(contact.getLastName() + contact.getFoneNumber());
            }
        }
    }
}
