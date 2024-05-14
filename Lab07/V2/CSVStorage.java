package Lab07.V2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Classe para armazenamento em formato CSV
public class CSVStorage implements ContactsStorage {
    private String fileLocation;

    // Recebe o nome do arquivo
    public CSVStorage(String filename) {
        this.fileLocation = filename;
    }

    @Override
    // Método para carregar contactos do arquivo
    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        try {
            List<String> contactsLines = Files.readAllLines(Paths.get(fileLocation));
            for (String line : contactsLines) {
                String[] contactData = line.split(",");
                if (contactData.length != 3)
                    continue;
                // Cria um novo objeto de contacto com os dados da linha e adiciona à lista de contatos
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
        // Abre um novo FileWriter para escrever no arquivo CSV (false indica que não queremos anexar, apenas substituir o conteúdo)
        try (FileWriter fw = new FileWriter(fileLocation, false);
             BufferedWriter bw = new BufferedWriter(fw); // Melhorar a eficiência na escrita
             PrintWriter out = new PrintWriter(bw)) { // Para escrever no arquivo de forma mais conveniente
            // Itera sobre cada contacto na lista 
            for (Contact c : list) {
                // Formata o contacto como uma linha CSV e escreve no arquivo
                String contactToText = String.format("%s,%d,%s\n", c.getEmail(), c.getNumber(), c.getName());
                out.print(contactToText);
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

}
