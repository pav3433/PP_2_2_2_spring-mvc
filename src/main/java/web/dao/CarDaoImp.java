package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    List<Car> carList;

    public CarDaoImp() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", 7, 5000));
        carList.add(new Car("Lada", 2107, 700));
        carList.add(new Car("Toyota", 300, 8000));
        carList.add(new Car("Porsche", 911, 12000));
        carList.add(new Car("Hyundai", 30, 1500));
    }
    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
