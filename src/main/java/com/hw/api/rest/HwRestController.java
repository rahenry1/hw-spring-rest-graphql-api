package com.hw.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HwRestController {

    @GetMapping("/hello}")
    public String getHwMessage(){
        return "Hello world - welcome";
    }
}
