package ie.atu.week2_lab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello";
    }

    //Using Get request
    @GetMapping("/greet/{Keelan}")
    public String greetByName(@PathVariable String Keelan) {
        return "Hello " + Keelan + "!";

    }


}
