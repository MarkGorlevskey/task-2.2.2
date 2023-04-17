package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars;

    {
        cars.add(new Car("Los", 343, "K089OP"));
        cars.add(new Car("erw", 1233, "X089OP"));
        cars.add(new Car("ooij", 854166, "M089XP"));
        cars.add(new Car("uoioz", 8665, "O089OP"));
        cars.add(new Car("oljue", 5547, "A082OA"));
        cars.add(new Car("erwyu", 1990, "X089OO"));
    }

    public CarServiceImp(List<Car> cars) {
        this.cars = new ArrayList<>();
    }

    public CarServiceImp() {

    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getCar(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }

    @Override
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
