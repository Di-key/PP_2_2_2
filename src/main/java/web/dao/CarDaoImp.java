package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Lada", "White", 10000, 2011));
        carList.add(new Car("Mazda", "Black", 20000,2012));
        carList.add(new Car("Skoda", "Silver", 30000, 2013));
        carList.add(new Car("Mercedes", "Blue", 40000, 2014));
        carList.add(new Car("BMV","Red",50000, 2015));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
