package exo1;

public class TextInfoContact implements FormatInfoContact {
    public String getInfoContact(Contact contact) {
        return "Nom: " + contact.getNom() + ", Numéro: " + contact.getNumero();
    }
}