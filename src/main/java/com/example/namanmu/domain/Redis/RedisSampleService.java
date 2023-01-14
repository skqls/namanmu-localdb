package com.example.namanmu.domain.Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;


@Service
public class  RedisSampleService {


    @Autowired
    private RedisTemplate redisTemplate;



    public void setRedisStringValue(String key, String field, Integer value ) {
        redisTemplate.opsForHash().increment(key, field, value);
        redisTemplate.expire(key,20, TimeUnit.SECONDS);


    }
}




