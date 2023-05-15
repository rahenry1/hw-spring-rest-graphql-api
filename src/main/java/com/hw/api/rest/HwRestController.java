package com.hw.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HwRestController {

    //https://spring.io/guides/tutorials/rest/

    @GetMapping("/hello")
    public String getHelloWorldMsg(){
        return "Hello world - welcome";
    }
}
