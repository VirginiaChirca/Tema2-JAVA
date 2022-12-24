package phone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Phone {
    private int imei;
    private static final AtomicInteger count = new AtomicInteger(0);
    private String material;
    private String color;
    private Map<String, Contact> contacts;
    private int id;
    private int batteryLife;

    private Map<String, List<Message>> messages;
    protected List<Call> callHistory;


    public Phone(int imei, String material, int batteryLife, String color, Contact[] contacts) {
        this.imei = imei;
        this.color = color;
        this.material = material;
        this.contacts = new HashMap<>();
        this.messages = new HashMap<>();
        this.batteryLife = batteryLife;
        this.callHistory = new ArrayList<>();
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setMaterial(String material) {

        this.material = material;
    }
    public void addContact(String id, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(id, firstName, lastName, phoneNumber);
        contacts.put(phoneNumber, contact);
    }
    public void list_contacts() {
        for(Contact contact : contacts.values()) {
            contact.afisare_contact();
        }
    }

    public void sendMessage(String phoneNumber, String content) {
        if (content.length() > 500) {
            throw new IllegalArgumentException("Mesajul depseste dimensiunea admisa");
        }
        Contact contact = contacts.get(phoneNumber);
        if (contact == null) {
            throw new IllegalArgumentException("Numar invalid");
        }

        Message message = new Message(contact, content);
        this.messages.computeIfAbsent(phoneNumber, k -> new ArrayList<>()).add(message);

        batteryLife--;
    }

    public void listMessages(String phoneNumber) {
        List<Message> messages = this.messages.get(phoneNumber);
        if (messages == null) {
            throw new IllegalArgumentException("Numar invalid");
        }

        for (Message message : messages) {
            message.afisare_mesaj();
        }
    }

    public void show_battery() {
        System.out.println("Nivel baterie: " + batteryLife +  "\n");
    }

    public void call(String phoneNumber) {
        Contact contact = contacts.get(phoneNumber);
        if (contact == null) {
            throw new IllegalArgumentException("Numar invalid");
        }

        Call call = new Call(contact, ThreadLocalRandom.current().nextInt(1, 60 + 1));
        this.callHistory.add(call);

        batteryLife = batteryLife - 2;
    }

    public void viewHistory() {
        for (Call call : callHistory) {
            call.afisare_apel();
        }
    }
}
