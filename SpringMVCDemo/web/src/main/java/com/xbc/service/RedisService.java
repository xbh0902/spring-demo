package com.xbc.service;

import com.xbc.database.model.Student;

import java.util.List;
import java.util.Map;

public interface RedisService {

    Object get(String name);

    Object getList(String name);

    Object getSet(String name);

    Object getZSet(String name);

    void setValue(String key, Object value);

    void setHash(String key, Map<String,? extends Object> map);

    Object getHashValue(String mapName,String key);

    Map<String,? extends Object> getHash(String key);

    void setList(String key, List<? extends Object> o);

    void setSet(String name, Student user);

    void setZSet(String name, List<Student> users);
}
