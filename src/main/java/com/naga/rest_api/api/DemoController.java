package com.naga.rest_api.api;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/get-time")
    public Map<String,Object> getDetails(){
        Map<String, Object> map = new HashMap<>();
        map.put("time", new Date());
        return map;
    }

}
