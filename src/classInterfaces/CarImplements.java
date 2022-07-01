package classInterfaces;

import java.util.List;

public class CarImplements implements CarCrud{
    @Override
    public void saveCar(Car car) {
        System.out.println("I'm the method save->" + car);
    }

    @Override
    public List<Car> findAll() {
        System.out.println("I'm the method findAll");
        return null;
    }

    @Override
    public void deleteCarById() {
        System.out.println("I'm the method delete");
    }
}
