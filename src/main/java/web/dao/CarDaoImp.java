package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{
    private List<Car> carList = new ArrayList<>(List.of(new Car("Lada", "White", 10000, 2011),
            new Car("Mazda", "Black", 20000,2012),
            new Car("Skoda", "Silver", 30000, 2013),
            new Car("Mercedes", "Blue", 40000, 2014),
            new Car("BMV","Red",50000, 2015)));

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
