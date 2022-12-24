package phone;

public class Main {
    public static void main(String[] args) {
        Contact []contact1 = new Contact[20];
        Phone phone1 = new SamsungGalaxy6(1234, "plastic", 100, "negru", contact1);
        Phone phone2 = new HUAWEInova9SE(1234, "plastic", 100, "negru", contact1);
        Phone phone3 = new HUAWEIMate50Pro(1234, "plastic", 100, "negru", contact1);
        Phone phone4 = new SamsungGalaxyS22(1234, "plastic", 100, "negru", contact1);
        Phone phone5 = new iPhone12(1234, "plastic", 100, "negru", contact1);
        Phone phone6 = new iPhone13Pro(1234, "plastic", 100, "negru", contact1);

        phone1.addContact("1", "0735744124", "Adela", "Popa");
        phone1.addContact("2", "0721147242", "Mihai", "Carol");
        phone1.list_contacts();

        phone1.sendMessage("0735744124", "Hello!");
        phone1.sendMessage("0735744124", "Ce mai faci?");
        phone1.listMessages("0735744124");

        phone1.call("0721147242");
        phone1.viewHistory();
        phone1.show_battery();
    }
}