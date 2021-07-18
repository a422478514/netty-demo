package com.daquan.practice.day17.attribute;

import com.daquan.practice.day17.session.Session;
import io.netty.util.AttributeKey;

public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
