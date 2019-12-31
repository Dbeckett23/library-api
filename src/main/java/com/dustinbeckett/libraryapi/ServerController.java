package com.dustinbeckett.libraryapi;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @RequestMapping("/greeting")
    public String index() {
        return "Greetings! Welcome to the library API!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@RequestBody String value) {
        return value;
    }
}
