package com.daquan.practice.day19.attribute;

import io.netty.util.AttributeKey;
import com.daquan.practice.day19.session.Session;

public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
