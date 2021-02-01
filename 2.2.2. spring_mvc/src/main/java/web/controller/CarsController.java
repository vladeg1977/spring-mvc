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
        if (count == null) {
            count = 5;
        }
        if (count == 2) {
            model.addAttribute("cars", carService.getCars().stream().limit(2).iterator());
        }
        if (count == 3) {
            model.addAttribute("cars", carService.getCars().stream().limit(3).iterator());
        }
        if (count == 4) {
            model.addAttribute("cars", carService.getCars().stream().limit(4).iterator());
        }
        if (count >= 5) {
            model.addAttribute("cars", carService.getCars().stream().limit(5).iterator());
        }
        return "cars";
    }
}
