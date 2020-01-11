package com.example.demo.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * description: TODO
 * date: 2020/1/11 0011 下午 22:39
 *
 * @author : Administrator
 * @since : 1.0
 **/
public class ContainerSingleton {
    private static Map<String ,Object > IOC = new ConcurrentHashMap<>();
    private ContainerSingleton() {
    }
    public static Object  getInstance(String className){
        if (IOC.containsKey(className)) {
            Object obj = null;
            try {
                obj = Class.forName(className)
                        .getDeclaredConstructor()
                        .newInstance();
            }catch (Exception e){
                e.printStackTrace();
            }
            return  obj;
        }else {
            return  IOC.get(className);
        }
    }
}
