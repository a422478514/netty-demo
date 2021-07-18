package com.daquan.practice.day16.attribute;

import io.netty.util.AttributeKey;
import com.daquan.practice.day16.session.Session;

public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
