package pro.sky.CalculatorNewTop.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CalculatorNewTop.Service.Service;

@RestController
@RequestMapping("/calculator")
public class FirstController {

    private final Service service;

    public FirstController (Service service){
        this.service = service;
    }

    @GetMapping()
    public String greeting() {
        return service.greeting();
    }

    @GetMapping("/plus")
    public String plus (@RequestParam int num1, @RequestParam int num2){
        return service.plus (num1, num2);
    }

    @GetMapping("/minus")
    public String minus (@RequestParam int num1, @RequestParam int num2){
        return service.minus (num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply (@RequestParam int num1, @RequestParam int num2){
        return service.multiply (num1, num2);
    }

    @GetMapping("/divide")
    public String divide (@RequestParam int num1, @RequestParam int num2){
        return service.divide (num1, num2);
    }

}
