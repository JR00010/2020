package com.example.demo.pattern.singleton;

/**
 * description: TODO
 * date: 2020/1/11 0011 下午 22:09
 *
 * @author : Administrator
 * @since : 1.0
 **/
public class LazySimpleSingleton2 {
    private  static LazySimpleSingleton2 lazySimpleSingleton2 ;

    private LazySimpleSingleton2() {
    }

    public static  LazySimpleSingleton2 getInstance(){
        if (lazySimpleSingleton2 == null){
            synchronized (LazySimpleSingleton2.class){
                if (lazySimpleSingleton2 == null){
                    lazySimpleSingleton2 = new LazySimpleSingleton2();
                }
            }
        }
        return lazySimpleSingleton2;
    }
}
