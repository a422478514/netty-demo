package com.daquan.practice.day18.attribute;

import com.daquan.practice.day18.session.Session;
import io.netty.util.AttributeKey;

public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
