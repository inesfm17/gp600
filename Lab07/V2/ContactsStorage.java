package Lab07.V2;

import java.util.List;

public interface ContactsStorage {
    
    List<Contact> loadContacts();

    boolean saveContacts(List<Contact> list);

}