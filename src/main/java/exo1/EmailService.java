package exo1;

public class EmailService implements MessageService {
    public void envoyerMessage(Contact contact, String message) {
        System.out.println("Envoi d'un email à " + contact.getNom() + " : " + message);
    }
}
