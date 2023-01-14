package com.example.namanmu.domain.Redis;

import com.example.namanmu.domain.Redis.RedisSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RedisSampleController {

    @Autowired
    private RedisSampleService redisSampleService;

//    @PostMapping("/hi")
//    public void setRedisStringValue(@RequestParam("key") String key, @RequestParam("value") String value) {
//        redisSampleService.setRedisStringValue(key, value);
//    }

    @PostMapping("/hi")
    public void setRedisStringValue(@RequestParam("key") String key, @RequestParam("field") String field, @RequestParam("value") Integer value) {
        redisSampleService.setRedisStringValue(key,field,value);
    }

}