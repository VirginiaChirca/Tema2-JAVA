package phone;

public abstract class Samsung extends Phone {
    public Samsung(int imei, String material, int batteryLife, String color, Contact[] contacts) {
        super(imei, material, batteryLife, color, contacts);
    }
}
