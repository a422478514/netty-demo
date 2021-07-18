package com.daquan.practice.day18.util;

import java.util.Random;

public class IDUtil {
    public static String randomId() {
        //return UUID.randomUUID().toString().split("-")[0];
        return ""+new Random().nextInt(100);
    }
}
