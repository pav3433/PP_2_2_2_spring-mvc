package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarsController {
    @Autowired
    CarDao carDao;

    @GetMapping(value = "/cars")
    public void printCars(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, ModelMap modelMap) {
        modelMap.addAttribute("cars", carDao.getCars(count));
    }
}
