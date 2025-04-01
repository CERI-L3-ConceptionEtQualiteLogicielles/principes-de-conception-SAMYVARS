package exo1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();
        MMSService mmsService = new MMSService();

        ContactManager contactManager = ContactManager.getInstance(emailService, smsService, mmsService);

        Contact contact = new Contact.ContactBuilder("Dupont", "0123456789")
                .addPrenom("Jean")
                .addCivilite("Monsieur")
                .addAdressePostale("123 Rue de Paris")
                .addAdresseMail("jean.dupont@example.com")
                .addDateAnniversaire(new Date())
                .addLieuDeTravail("Entreprise XYZ")
                .addVille("Paris")
                .build();

        System.out.println("========== Ajout du contact ==========");
        contactManager.ajouteContact(contact);

        System.out.println("======= Affichage des contacts =======");
        contactManager.afficheContacts();

        System.out.println("========== Envoi d'un email ==========");
        contactManager.envoiEmail(contact, "Bonjour Jean, ceci est un test d'email.");

        System.out.println("=========== Envoi d'un SMS ===========");
        contactManager.envoiSMS(contact, "Bonjour Jean, ceci est un test de SMS.");

        System.out.println("=========== Envoi d'un MMS ===========");
        contactManager.envoiMMS(contact, "image.jpg");

        System.out.println("== Affichage des infos en format JSON ==");
        JSONInfoContact jsonInfo = new JSONInfoContact();
        System.out.println(jsonInfo.getInfoContact(contact));

        System.out.println("== Affichage des infos en format XML ==");
        XMLInfoContact xmlInfo = new XMLInfoContact();
        System.out.println(xmlInfo.getInfoContact(contact));

        System.out.println("== Affichage des infos en format texte ==");
        TextInfoContact textInfo = new TextInfoContact();
        System.out.println(textInfo.getInfoContact(contact));
    }
}