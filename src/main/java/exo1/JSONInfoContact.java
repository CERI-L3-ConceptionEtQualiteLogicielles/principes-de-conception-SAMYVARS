package exo1;

public class JSONInfoContact implements FormatInfoContact {
    public String getInfoContact(Contact contact) {
        return "{" +
                "\n\t\"nom\": \"" + contact.getNom() + "\"," +
                "\n\t\"numero\": \"" + contact.getNumero() + "\"," +
                (contact.getPrenom() != null ? "\n\t\"prenom\": \"" + contact.getPrenom() + "\"," : "") +
                (contact.getCivilite() != null ? "\n\t\"civilite\": \"" + contact.getCivilite() + "\"," : "") +
                (contact.getAdressePostale() != null ? "\n\t\"adressePostale\": \"" + contact.getAdressePostale() + "\"," : "") +
                (contact.getAdresseMail() != null ? "\n\t\"adresseMail\": \"" + contact.getAdresseMail() + "\"," : "") +
                (contact.getDateAnniversaire() != null ? "\n\t\"dateAnniversaire\": \"" + contact.getDateAnniversaire() + "\"," : "") +
                (contact.getLieuDeTravail() != null ? "\n\t\"lieuDeTravail\": \"" + contact.getLieuDeTravail() + "\"," : "") +
                (contact.getVille() != null ? "\n\t\"ville\": \"" + contact.getVille() + "\"" : "") +
                "\n}";
    }
}