package exo1;

public class XMLInfoContact implements FormatInfoContact {
    public String getInfoContact(Contact contact) {
        return "<contact>" +
                "\n\t<nom>" + contact.getNom() + "</nom>" +
                "\n\t<numero>" + contact.getNumero() + "</numero>" +
                (contact.getPrenom() != null ? "\n\t<prenom>" + contact.getPrenom() + "</prenom>" : "") +
                (contact.getCivilite() != null ? "\n\t<civilite>" + contact.getCivilite() + "</civilite>" : "") +
                (contact.getAdressePostale() != null ? "\n\t<adressePostale>" + contact.getAdressePostale() + "</adressePostale>" : "") +
                (contact.getAdresseMail() != null ? "\n\t<adresseMail>" + contact.getAdresseMail() + "</adresseMail>" : "") +
                (contact.getDateAnniversaire() != null ? "\n\t<dateAnniversaire>" + contact.getDateAnniversaire() + "</dateAnniversaire>" : "") +
                (contact.getLieuDeTravail() != null ? "\n\t<lieuDeTravail>" + contact.getLieuDeTravail() + "</lieuDeTravail>" : "") +
                (contact.getVille() != null ? "\n\t<ville>" + contact.getVille() + "</ville>" : "") +
                "\n</contact>";
    }
}