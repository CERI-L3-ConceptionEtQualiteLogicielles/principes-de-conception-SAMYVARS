package exo1;

public class SMSService implements MessageService {
    public void envoyerMessage(Contact contact, String message) {
        System.out.println("Envoi d'un SMS à " + contact.getNom() + " : " + message);
    }
}
