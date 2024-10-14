package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/car")
    public String printCars(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        if (count != null && Integer.parseInt(count) > 0 && Integer.parseInt(count) < 6) {
            model.addAttribute("carsList", carService.getNumberOfCars(Integer.parseInt(count)));
        } else {
            model.addAttribute("carsList", carService.getNumberOfCars(5));
        }
        return "car";
    }
}
