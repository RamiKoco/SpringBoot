package car;

import car.business.abstracts.CarService;
import car.business.concretes.CarManager;
import car.dataAccess.concretes.HibernateCarDao;
import car.entities.concretes.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarManager(new HibernateCarDao());

        Car car = new Car(1, 1, "BMW", 100000, 20);
        Car car2 = new Car(2, 2, "Audi", 100000, 20);
        Car car3 = new Car(3, 3, "Volkswagen", 100000, 20);
        Car car4 = new Car(4, 4, "Mustang", 100000, 20);

        carService.add(car);
        carService.add(car2);
        carService.add(car3);
        carService.add(car4);
        carService.delete(3);
        carService.show();
    }
}
