package ClassesInheritanceObjPolym;

public class SmartDevice {

    private double price;
    private String batery;
    private String versionBluetooth;

    public SmartDevice() {
    }

    public SmartDevice(double price, String batery, String versionBluetooth) {
        this.price = price;
        this.batery = batery;
        this.versionBluetooth = versionBluetooth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBatery() {
        return batery;
    }

    public void setBatery(String batery) {
        this.batery = batery;
    }

    public String getVersionBluetooth() {
        return versionBluetooth;
    }

    public void setVersionBluetooth(String versionBluetooth) {
        this.versionBluetooth = versionBluetooth;
    }
}
