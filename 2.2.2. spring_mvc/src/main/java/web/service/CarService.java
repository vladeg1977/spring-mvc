package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    Car car1 = new Car("KIA", "RIO", 125);
    Car car2 = new Car("BMW", "X6", 350);
    Car car3 = new Car("LADA", "LARGUS", 105);
    Car car4 = new Car("HONDA", "FIT", 95);
    Car car5 = new Car("MAZDA", "BONGO", 150);

    public List<Car> getCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        List<Car> carList;
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        if (count == null) {
            carList = cars;
        } else {
            carList = cars.stream().limit(count).collect(Collectors.toList());
        }
        return carList;
    }
}
