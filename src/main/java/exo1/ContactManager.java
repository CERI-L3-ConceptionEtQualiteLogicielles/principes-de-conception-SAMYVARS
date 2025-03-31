package exo1;

import java.util.ArrayList;
import java.util.List;

public class ContactManager implements ContactService {
    private static List<Contact> lesContacts = new ArrayList<>();

    private final EmailService emailService;
    private final SMSService smsService;
    private final MMSService mmsService;

    public ContactManager(EmailService emailService, SMSService smsService, MMSService mmsService) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.mmsService = mmsService;
    }

    public void ajouteContact(Contact contact) {
        lesContacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        lesContacts.remove(contact);
    }

    public void envoiEmail(Contact contact, String message) {
        emailService.envoyerMessage(contact, message);
    }

    public void envoiSMS(Contact contact, String message) {
        smsService.envoyerMessage(contact, message);
    }

    public void envoiMMS(Contact contact, String image) {
        mmsService.envoyerMessage(contact, image);
    }

    public void afficheContacts() {
        for (Contact contact : lesContacts) {
            System.out.println(contact);
        }
    }

    public void sauvegardeEnBD() {
    }
}
