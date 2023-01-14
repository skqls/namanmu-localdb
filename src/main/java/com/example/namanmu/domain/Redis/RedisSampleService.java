package com.example.namanmu.domain.Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisSampleService {

    @Autowired
    private RedisTemplate redisTemplate;

//    public void setRedisStringValue(String key, String value) {
//        ValueOperations<String, String> stringValueOperations = stringRedisTemplate.opsForValue();
//        stringValueOperations.set(key, value);
//        System.out.println("Redis key : " + key);
//        System.out.println("Redis value : " + stringValueOperations.get(key));
//    }
//
//    public void setRedisStringValue(String key, String field, Integer value) {
//        HashOperations<String, String, Integer> hashOperations = redisTemplate.opsForHash();
//        hashOperations.increment(key, field, value);
//        System.out.println("Redis key : " + key + field + " : " + hashOperations.get(key, field));

//    public void setRedisStringValue(String key, String field, Integer value) {
//        HashOperations<String, String, Integer> hashOperations = redisTemplate.opsForHash();
//        hashOperations.putIfAbsent(key, field, 0);
//        hashOperations.increment(key, field, value);
//        System.out.println("Redis key : " + key + field + " : " + hashOperations.get(key, field));
//    }


    public void setRedisStringValue(String key, String field, Integer value ) {
        redisTemplate.opsForHash().increment(key, field, value);
//        System.out.println("Redis key : " + key + field + " : " + redisTemplate.opsForHash().get(key, field));
//        System.out.println("Redis key : " + key + field + " : " + hashOperations.get(key, field));
    }





//        stringValueOperations.set(key, value);
//        System.out.println("Redis key : " + key);
//        System.out.println("Redis value : " + stringValueOperations.get(key));
    }




