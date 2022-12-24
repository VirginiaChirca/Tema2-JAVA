package phone;

import java.time.LocalDate;

public class Call{
    private Contact contact;
    private LocalDate now;
    private int minutes;

//    public Call(Contact contact, String date, int minutes) {
//        this.contact = contact;
//        this.date = date;
//        this.minutes = minutes;
//    }

    public Call(Contact contact, int minutes) {
        this.contact = contact;
        this.minutes = minutes;
        now = java.time.LocalDate.now();
    }


    public void afisare_apel() {
        System.out.println("Numar telefon: " + contact.getPhoneNumber());
        System.out.println("Data: " + now);
        System.out.println("Durata: " + minutes +  " minutes" + "\n");
    }

    public Contact getContact() {
        return contact;
    }
}
