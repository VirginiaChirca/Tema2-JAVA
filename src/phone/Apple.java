package phone;

public abstract class Apple extends Phone{

    public Apple(int imei, String material, int batteryLife, String color, Contact[] contacts) {
        super(imei, material, batteryLife, color, contacts);
    }
}
