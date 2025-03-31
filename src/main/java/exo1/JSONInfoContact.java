package exo1;

public class JSONInfoContact implements FormatInfoContact{
    public String getInfoContact(Contact contact) {
        return "{" +
                "\n\t\"nom\": \"" + contact.getNom() + "\"," +
                "\n\t\"numero\": \"" + contact.getNumero() + "\"" +
                "\n}";
   }
}
