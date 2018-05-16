package com.xbc.service.impl;

import com.xbc.database.model.Student;
import com.xbc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;


@Service("redisService")
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Object get(String key) {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object o = valueOperations.get(key);
        return o;
    }

    @Override
    public Object getSet(String name) {
        return null;
    }

    @Override
    public Object getZSet(String name) {
        return null;
    }

    @Override
    public void setValue(String key, Object value) {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value);
    }

    @Override
    public void setHash(String key, Map<String, ? extends Object> map) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.putAll(key, map);
    }

    @Override
    public Object getHashValue(String mapName, String key) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        Object o = null;
        if (hashOperations.hasKey(mapName, key)) {
            o = hashOperations.get(mapName, key);
        }
        return o;
    }

    @Override
    public Map<String, ? extends Object> getHash(String key) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        Map<String, Object> map = hashOperations.entries(key);
        return map;
    }

    @Override
    public void setList(String key, List<? extends Object> os) {
        ListOperations<String,Object> listOperations = redisTemplate.opsForList();
        for (Object o : os) {
            listOperations.leftPush(key, o);
        }
    }

    @Override
    public List getList(String key) {
        ListOperations listOperations = redisTemplate.opsForList();
        List o = null;
        if (listOperations.size(key) > 0) {
            o = (List) listOperations.range(key, 0, -1);
        }
        return o;
    }

    @Override
    public void setSet(String name, Student user) {
    }

    @Override
    public void setZSet(String name, List<Student> users) {


    }
}
