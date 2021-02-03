package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.CarService;

@Controller
public class CarsController {
    CarService carService = new CarService();
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(required = false) Integer count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
