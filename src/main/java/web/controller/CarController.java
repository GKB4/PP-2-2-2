package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/car")
    public String printCars(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        List<Car> carList = null;
        if (count != null && Integer.parseInt(count) > 0 && Integer.parseInt(count) < 6) {
            carList = new CarServiceImpl().getNumberOfCars(Integer.parseInt(count));
        } else {
            carList = new CarServiceImpl().getNumberOfCars(5);
        }
        model.addAttribute("carsList", carList);
        return "car";
    }
}
