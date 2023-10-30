package car.business.abstracts;

import car.entities.concretes.Car;

import java.util.List;


public interface CarService {
    void add(Car car);
    void delete(int id);

    void   show();
}
