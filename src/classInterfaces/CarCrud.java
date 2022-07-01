package classInterfaces;

import java.util.List;

public interface CarCrud {

    void saveCar(Car car);
    List<Car> findAll();
    void deleteCarById();
}
