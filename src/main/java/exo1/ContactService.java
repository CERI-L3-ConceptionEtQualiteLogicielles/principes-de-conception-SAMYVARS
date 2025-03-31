package exo1;

public interface ContactService {
    void ajouteContact(Contact contact);
    void supprimeContact(Contact contact);
    void envoiEmail(Contact contact, String message);
    void envoiSMS(Contact contact, String message);
    void afficheContacts();
}