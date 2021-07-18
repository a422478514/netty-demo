package com.daquan.practice.day11.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.daquan.practice.day11.serialize.SerializerAlogrithm;
import com.daquan.practice.day11.serialize.Serializer;

public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlogrithm() {
        return SerializerAlogrithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {

        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {

        return JSON.parseObject(bytes, clazz);
    }
}
