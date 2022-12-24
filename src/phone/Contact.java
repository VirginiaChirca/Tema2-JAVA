package phone;

public class Contact {

    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public void afisare_contact() {
        System.out.println("ID: " + id);
        System.out.println("Prenume: " + firstName + ", Nume: " + lastName);
        System.out.println("Numar telefon: " + phoneNumber +  "\n");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
