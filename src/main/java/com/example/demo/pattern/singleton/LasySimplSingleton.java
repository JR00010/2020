package com.example.demo.pattern.singleton;

/**
 * description: TODO
 * date: 2020/1/11 0011 下午 22:03
 *
 * @author : Administrator
 * @since : 1.0
 **/
public class LasySimplSingleton {
    private static  LasySimplSingleton lasySimplSingleton;
    private LasySimplSingleton() {
    }

    public static synchronized LasySimplSingleton getSinleton(){
        if (lasySimplSingleton == null){
            lasySimplSingleton = new LasySimplSingleton();
        }
        return  lasySimplSingleton;
    }
}
