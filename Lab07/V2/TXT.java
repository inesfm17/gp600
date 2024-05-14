package Lab07.V2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Para armazenamento em formato TXT
public class TXT implements ContactsStorage {
    private String fileLocation;

    public TXT(String filename) {
        this.fileLocation = filename;
    }

    @Override
    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        try {
            List<String> contactsLines = Files.readAllLines(Paths.get(fileLocation));
            for (String line : contactsLines) {
                String[] contactData = line.split("\t");
                if (contactData.length != 3)
                    continue;
                // Cria um novo objeto de contato com os dados da linha e adiciona à lista de contatos
                Contact contact = new Contact(contactData[2], Long.parseLong(contactData[1]), contactData[0]);
                contacts.add(contact);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contacts;
    }

    @Override
    public boolean saveContacts(List<Contact> list) {
        try {
            Files.delete(Paths.get(fileLocation));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fw = new FileWriter(fileLocation, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            for (Contact c : list) {
                // append to file
                String contactToText = String.format("%s\t%d\t%s\n", c.getEmail(), c.getNumber(), c.getName());
                out.print(contactToText);
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

}