package com.example.demo.pattern.singleton;

/**
 * description:这种模式可以由反射破坏
 * date: 2020/1/11 0011 下午 22:13
 *
 * @author : Administrator
 * @since : 1.0
 **/
public class LazyInnerSingleton {

    private LazyInnerSingleton() {
    }

    private static class LazyHolder{
        private  static final  LazyInnerSingleton INNER_SINGLETON = new LazyInnerSingleton();
    }

    public static  LazyInnerSingleton getInstance(){
        return  LazyHolder.INNER_SINGLETON;
    }
}
