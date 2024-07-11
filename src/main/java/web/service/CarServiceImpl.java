package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = Arrays.asList(
            new Car("BMW", 5, "black"),
            new Car("Opel", 2, "white"),
            new Car("Ford", 92, "yellow"),
            new Car("Lada", 1, "blue"),
            new Car("KIA", 3, "green")
    );

    @Override
    public List<Car> getCar(Integer count) {
        if (count == null || count < 1 || count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
