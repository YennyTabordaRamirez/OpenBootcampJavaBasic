package ClassesInheritanceObjPolym;

public class SmartWatch extends SmartDevice {

    private  double handlePrice;

    public SmartWatch() {
    }

    public SmartWatch(double price, String batery, String versionBluetooth, double handlePrice) {
        super(price, batery, versionBluetooth);
        this.handlePrice = handlePrice;
    }

    public double getHandlePrice() {
        return handlePrice;
    }

    public void setHandlePrice(double handlePrice) {
        this.handlePrice = handlePrice;
    }
}
