package com.hw.api.hwspringrestgraphqlapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HwController {

    @GetMapping("/hello}")
    public String getHwMessage(){
        return "Hello world - welcome";
    }
}
