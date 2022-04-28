package com.va.baseproject.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class TestController {

    @GetMapping("/")
    public String test() {
        log.info("adu");
        return "test rest";
    }
}
