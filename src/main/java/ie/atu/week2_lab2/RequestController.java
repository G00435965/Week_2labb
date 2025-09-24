package ie.atu.week2_lab2;

import org.springframework.web.bind.annotation.*;

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

    //Request Param
    @GetMapping("/details")
    public String details(@RequestParam String Keelan, @RequestParam int age) {
        return "Hello " + Keelan + ", Age: " + age;
    }



}
