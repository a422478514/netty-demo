package com.daquan.practice.day17.util;

import java.util.UUID;

public class IDUtil {
    public static String randomId() {
        //return UUID.randomUUID().toString().split("-")[0];
        Double d = Math.random()*1000;
        return String.valueOf(d.intValue());
    }
}
