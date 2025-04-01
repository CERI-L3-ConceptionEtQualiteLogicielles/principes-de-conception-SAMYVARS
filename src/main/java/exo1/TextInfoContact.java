package exo1;

public class TextInfoContact implements FormatInfoContact {
    public String getInfoContact(Contact contact) {
        return "Nom: " + contact.getNom() + ", Numéro: " + contact.getNumero() +
                (contact.getPrenom() != null ? ", Prénom: " + contact.getPrenom() : "") +
                (contact.getCivilite() != null ? ", Civilité: " + contact.getCivilite() : "") +
                (contact.getAdressePostale() != null ? ", Adresse Postale: " + contact.getAdressePostale() : "") +
                (contact.getAdresseMail() != null ? ", Adresse Mail: " + contact.getAdresseMail() : "") +
                (contact.getDateAnniversaire() != null ? ", Date Anniversaire: " + contact.getDateAnniversaire() : "") +
                (contact.getLieuDeTravail() != null ? ", Lieu de Travail: " + contact.getLieuDeTravail() : "") +
                (contact.getVille() != null ? ", Ville: " + contact.getVille() : "");
    }
}