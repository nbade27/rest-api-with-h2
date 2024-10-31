package com.naga.rest_api.api;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DemoController {

    @GetMapping("/time")
    public Map<String,Object> getTimeMethod(){
        log.info("Started executing getTimeMethod");
        Map<String, Object> map = new HashMap<>();
        map.put("time", new Date());
        log.info("Exiting getTimeMethod");
        return map;
    }

}
