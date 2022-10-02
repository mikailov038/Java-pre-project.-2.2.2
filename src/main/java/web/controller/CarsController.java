package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.CarModel;
import web.service.CarService;




import java.util.ArrayList;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    public CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count,
                            ModelMap model) {
        model.addAttribute("cars", carService.getCarsList(count));
        return "cars";
    }


}
