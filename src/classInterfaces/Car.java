package classInterfaces;

public class Car {

    private String idCar;
    private int model;
    private String brand;

    public Car() {
    }

    public Car(String idCar, int model, String brand) {
        this.idCar = idCar;
        this.model = model;
        this.brand = brand;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar='" + idCar + '\'' +
                ", model=" + model +
                ", brand='" + brand + '\'' +
                '}';
    }
}
