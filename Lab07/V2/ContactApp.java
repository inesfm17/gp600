package Lab07.V2;

import java.util.ArrayList;
import java.util.List;

// Classe que implementa a interface ContactsInterface para gerenciar contatos
public class ContactApp implements ContactsInterface {

    private ContactsStorage storage; // Armazena o objeto para manipulação de armazenamento 
    private List<Contact> contacts = new ArrayList<>();

    @Override
    public void openAndLoad(ContactsStorage store) {
        this.storage = store;
        contacts = store.loadContacts();
    }

    @Override
    public void saveAndClose() {
        storage.saveContacts(contacts);
    }

    @Override
    public void saveAndClose(ContactsStorage store) {
        store.saveContacts(contacts);
    }

    @Override
    public boolean exist(Contact contact) {
        return contacts.stream().anyMatch(x -> x.equals(contact));
    }

    @Override
    public Contact getByName(String name) {
        return contacts.stream().filter(x -> x.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public boolean add(Contact contact) {
        return contacts.add(contact);
    }

    @Override
    public boolean remove(Contact contact) {
        return contacts.remove(contact);
    }
}