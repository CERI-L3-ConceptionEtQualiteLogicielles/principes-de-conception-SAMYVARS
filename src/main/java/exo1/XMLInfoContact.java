package exo1;

public class XMLInfoContact {
    public String getInfoContact(Contact contact) {
        return "<contact>" +
                "\n\t<nom>" + contact.getNom() + "</nom>" +
                "\n\t<numero>" + contact.getNumero() + "</numero>" +
                "\n</contact>";
    }
}
