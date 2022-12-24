package phone;

public class Message {
    private Contact contact;
    private String content;

    public Message(Contact contact, String content) {
        this.contact = contact;
        this.content = content;
    }

    public void afisare_mesaj() {
        System.out.println("Numar telefon: " + contact.getPhoneNumber());
        System.out.println("Continut: " + content + "\n");
    }
}
