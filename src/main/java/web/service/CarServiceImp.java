package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private List<Car> carList;

    public CarServiceImp() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", 7, 5000));
        carList.add(new Car("Lada", 2107, 700));
        carList.add(new Car("Toyota", 300, 8000));
        carList.add(new Car("Porsche", 911, 12000));
        carList.add(new Car("Hyundai", 30, 1500));
        carList.add(new Car("BMW", 7, 5000));
        carList.add(new Car("Lada", 2107, 700));
        carList.add(new Car("Toyota", 300, 8000));
        carList.add(new Car("Porsche", 911, 12000));
        carList.add(new Car("Hyundai", 30, 1500));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}
