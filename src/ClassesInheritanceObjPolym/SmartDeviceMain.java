package ClassesInheritanceObjPolym;

public class SmartDeviceMain {

    public static void main(String[] args) {

        SmartDevice phone = new SmartPhone(); //Aqui se puede hacer uso de los set para asignar valores
        SmartDevice phone2 = new SmartPhone(1000000, "3500mAh", "4.0", "4G");

        SmartDevice watch = new SmartWatch();//Aqui se puede hacer uso de los set para asignar valores
        SmartDevice watch2 = new SmartWatch(3000000, "6500mAh", "3.0", 300);

        System.out.println("the SmartPhone information is: " + "\n"+
                "\t"+"Price: $" + phone2.getPrice()+ "\n"+
                "\t"+  "Batery: " + phone2.getBatery()+ "\n"+
                "\t"+ "Version Bluetooth: " + phone2.getVersionBluetooth()+ "\n"+
                "\t"+"Sign: " + ((SmartPhone) phone2).getSign()+ "\n");

        System.out.println("the SmartWatch information is: " + "\n"+
                "\t"+ "Price: $" + watch2.getPrice()+ "\n"+
                "\t"+ "Batery: " + watch2.getBatery()+ "\n"+
                "\t"+ "Version Bluetooth: " + watch2.getVersionBluetooth()+ "\n"+
                "\t"+ "Handle price: $" + ((SmartWatch) watch2).getHandlePrice()+ "\n");
    }
    }