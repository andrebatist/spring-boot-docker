package ru.aplaksin.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/message")
    public String getMessage() {
        return "Welcome!";
    }
}
