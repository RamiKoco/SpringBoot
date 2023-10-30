package car.dataAccess.concretes;

import car.dataAccess.abstracts.CarDao;
import car.entities.concretes.Car;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCarDao implements CarDao {
    private List<Car> carList;

    public BaseCarDao() {
        carList = new ArrayList<>();
    }

    @Override
    public void add(Car car) {
        System.out.println("Araba eklendi " + car.getName());
        carList.add(car);
    }

    @Override
    public void update(Car car) {
        System.out.println("Araba güncellendi " + car.getName());
    }

    public void delete(Car car) {
        carList.remove(car);
    }

    @Override
    public Car get(int id) {
        return null;
    }

    @Override
    public List<Car> getAll() {
        return carList;
    }
}
