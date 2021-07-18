package com.daquan.practice.day15.attribute;

import com.daquan.practice.day15.session.Session;
import io.netty.util.AttributeKey;

public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
