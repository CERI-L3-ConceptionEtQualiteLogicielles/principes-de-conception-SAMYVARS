package exo1;

public class MMSService implements MessageService {
    private final PhotoService photoService = new PhotoService();

    @Override
    public void envoyerMessage(Contact contact, String image) {
        System.out.println("Envoi d'un MMS à " + contact.getNom() + " : " + image);
        photoService.envoiPhoto(contact, image);
    }
}
