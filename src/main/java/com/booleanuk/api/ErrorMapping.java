package com.booleanuk.api;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorMapping implements ErrorController {

    @RequestMapping("/error")
    public String gerError() {
        return "This is the new page";
    }
}