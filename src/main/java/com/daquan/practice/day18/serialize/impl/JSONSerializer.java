package com.daquan.practice.day18.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.daquan.practice.day18.serialize.SerializerAlgorithm;
import com.daquan.practice.day18.serialize.Serializer;

public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
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
