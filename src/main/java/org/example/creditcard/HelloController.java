package org.example.creditcard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    NameProvider nameProvider;
    @GetMapping("/hello")
    String hello(){
        return "H1 5 kuba";
    }
    @GetMapping("/names")
    List<String> names(){
        return this.nameProvider.allNames();
    }

    public HelloController(NameProvider nameProvider) {
        this.nameProvider = nameProvider;
    }
}
