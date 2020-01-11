package com.example.demo.pattern.singleton;

/**
 * description: 可以由序列化破坏
 * date: 2020/1/11 0011 下午 22:19
 *
 * @author : Administrator
 * @since : 1.0
 **/
public class LazyInnerSingleton2 {
    public LazyInnerSingleton2() {
        if (LazyHolder.LAZY_INNER_SINGLETON_2 != null){
            throw  new RuntimeException("不能创建多个实例");
        }
    }

    private static  class  LazyHolder{
        private static final LazyInnerSingleton2 LAZY_INNER_SINGLETON_2 = new LazyInnerSingleton2();
    }
    public static  LazyInnerSingleton2 getInstance(){
        return LazyHolder.LAZY_INNER_SINGLETON_2;
    }
}
