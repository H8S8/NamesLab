package com.example.names.controllers;

import com.example.names.models.Celebration;
import com.example.names.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //Tells Java that this class is a controller, also includes @ResponseBody
@RequestMapping(value = "/greeting") //Indicates that these mappings happen at the end of /greeting
public class GreetingController {

    @GetMapping
    public Greeting getGreeting(@RequestParam(defaultValue = "timeOfDay placeholder") String timeOfDay){
        return new Greeting("Colin", timeOfDay); //http://localhost:8080/greeting?timeOfDay=4pm
    }

    @GetMapping("/summer")
    public Celebration getCelebration(){
        return new Celebration("Happy summer solstice!");
    }
}
