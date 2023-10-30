package car.business.concretes;

import car.business.abstracts.CarService;
import car.dataAccess.abstracts.CarDao;
import car.entities.concretes.Car;

import java.util.ArrayList;
import java.util.List;

public class CarManager implements CarService {
    private CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    public void add(Car car) {
        for (Car carData : carDao.getAll()) {
            if (carData.getId() == car.getId()) {
                System.out.println("Aynı ID'ye sahip başka bir araç var: " + carData.getName());
                return;
            }
        }
        carDao.add(car);
    }

    public void delete(int id) {
        Car carToDelete = null;

        for (Car carData : carDao.getAll()) {
            if (carData.getId() == id) {
                carToDelete = carData;
                break;
            }
        }

        if (carToDelete != null) {
            carDao.delete(carToDelete);
            System.out.println("Araba silindi: " + carToDelete.getName());
        } else {
            System.out.println("Silinecek araç bulunamadı.");
        }
    }
    public void show()
    {
        List<Car> carL = carDao.getAll();
        for (Car car: carL)
        {
            System.out.println(car.getId());
        }
    }
}
