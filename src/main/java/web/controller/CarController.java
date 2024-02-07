package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "0") int count, Model model) {
        List<Car> carList;
        if (count >= 5) {
            carList = carService.getAllCars();
        } else if (count > 0) {
            carList = carService.getCars(count);
        } else {
            carList = carService.getAllCars();
        }
        model.addAttribute("cars", carList);
        return "cars";


    }


}

