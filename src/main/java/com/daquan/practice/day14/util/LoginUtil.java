package com.daquan.practice.day14.util;

import com.daquan.practice.day14.attribute.Attributes;
import io.netty.channel.Channel;
import io.netty.util.Attribute;

public class LoginUtil {
    public static void markAsLogin(Channel channel) {
        channel.attr(Attributes.LOGIN).set(true);
        channel.attr(Attributes.DAQUAN).set("daquan");
    }

    public static boolean hasLogin(Channel channel) {
        Attribute<Boolean> loginAttr = channel.attr(Attributes.LOGIN);
        return loginAttr.get() != null;
    }
}
