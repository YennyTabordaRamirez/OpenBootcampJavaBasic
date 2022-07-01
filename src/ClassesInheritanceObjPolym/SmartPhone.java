package ClassesInheritanceObjPolym;

public class SmartPhone extends SmartDevice{

    private String sign;

    public SmartPhone() {
    }

    public SmartPhone(double price, String batery, String versionBluetooth, String sign) {
        super(price, batery, versionBluetooth);
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
