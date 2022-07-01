package classInterfaces;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("123", 2020, "Mazda");
        CarCrud carCrudImplement = new CarImplements();

        carCrudImplement.saveCar(car);
        carCrudImplement.findAll();
        carCrudImplement.deleteCarById();

    }
}
