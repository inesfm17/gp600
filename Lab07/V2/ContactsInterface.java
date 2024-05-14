package Lab07.V2;

public interface ContactsInterface {

    void openAndLoad(ContactsStorage store);

    void saveAndClose();

    void saveAndClose(ContactsStorage store);

    boolean exist(Contact contact);

    Contact getByName(String name);

    boolean add(Contact contact);

    boolean remove(Contact contact);

}