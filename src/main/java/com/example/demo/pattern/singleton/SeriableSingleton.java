package com.example.demo.pattern.singleton;

import java.io.Serializable;

/**
 * description:  反序列化单列
 * date: 2020/1/11 0011 下午 22:25
 *
 * @author : Administrator
 * @since : 1.0
 **/
public class SeriableSingleton implements Serializable {
    private static  final  SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static  SeriableSingleton getInstance(){
        return  INSTANCE;
    }

    public Object readResolve(){
        return INSTANCE;
    }
}
