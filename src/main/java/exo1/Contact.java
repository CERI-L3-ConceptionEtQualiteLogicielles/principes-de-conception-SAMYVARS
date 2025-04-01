package exo1;

import java.util.Date;

public class Contact {
    private final String nom;
    private final String numero;
    private final String prenom;
    private final String civilite;
    private final String adressePostale;
    private final String adresseMail;
    private final Date dateAnniversaire;
    private final String lieuDeTravail;
    private final String ville;

    private Contact(ContactBuilder builder) {
        this.nom = builder.nom;
        this.numero = builder.numero;
        this.prenom = builder.prenom;
        this.civilite = builder.civilite;
        this.adressePostale = builder.adressePostale;
        this.adresseMail = builder.adresseMail;
        this.dateAnniversaire = builder.dateAnniversaire;
        this.lieuDeTravail = builder.lieuDeTravail;
        this.ville = builder.ville;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCivilite() {
        return civilite;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public Date getDateAnniversaire() {
        return dateAnniversaire;
    }

    public String getLieuDeTravail() {
        return lieuDeTravail;
    }

    public String getVille() {
        return ville;
    }

    public String getInfoContact(FormatInfoContact info) {
        return info.getInfoContact(this);
    }

    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Numéro: " + getNumero() +
                (getPrenom() != null ? ", Prénom: " + getPrenom() : "") +
                (getCivilite() != null ? ", Civilité: " + getCivilite() : "") +
                (getAdressePostale() != null ? ", Adresse Postale: " + getAdressePostale() : "") +
                (getAdresseMail() != null ? ", Adresse Mail: " + getAdresseMail() : "") +
                (getDateAnniversaire() != null ? ", Date Anniversaire: " + getDateAnniversaire() : "") +
                (getLieuDeTravail() != null ? ", Lieu de Travail: " + getLieuDeTravail() : "") +
                (getVille() != null ? ", Ville: " + getVille() : "");
    }

    public static class ContactBuilder {
        private final String nom;
        private final String numero;
        private String prenom;
        private String civilite;
        private String adressePostale;
        private String adresseMail;
        private Date dateAnniversaire;
        private String lieuDeTravail;
        private String ville;

        public ContactBuilder(String nom, String numero) {
            this.nom = nom;
            this.numero = numero;
        }

        public ContactBuilder addPrenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public ContactBuilder addCivilite(String civilite) {
            this.civilite = civilite;
            return this;
        }

        public ContactBuilder addAdressePostale(String adressePostale) {
            this.adressePostale = adressePostale;
            return this;
        }

        public ContactBuilder addAdresseMail(String adresseMail) {
            this.adresseMail = adresseMail;
            return this;
        }

        public ContactBuilder addDateAnniversaire(Date dateAnniversaire) {
            this.dateAnniversaire = dateAnniversaire;
            return this;
        }

        public ContactBuilder addLieuDeTravail(String lieuDeTravail) {
            this.lieuDeTravail = lieuDeTravail;
            return this;
        }

        public ContactBuilder addVille(String ville) {
            this.ville = ville;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}