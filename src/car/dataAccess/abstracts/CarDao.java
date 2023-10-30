package car.dataAccess.abstracts;

import car.entities.concretes.Car;

import java.util.List;

public interface CarDao {
    void add(Car car);
    void update(Car car);
    void delete(Car car);
    Car get(int id);

    List<Car> getAll();
}
