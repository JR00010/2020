package com.example.demo.pattern.singleton;

/**
 * description: 优点： 没有加任何锁、执行效率比较高，用户体验比懒汉式单例模式更好。
 *              缺点： 类加载的时候就初始化，不管用与不用都占着空间，浪费了内存，有可能“占着茅坑
 *              不拉屎
 * date: 2020/1/11 0011 下午 21:53
 * @author : Administrator
 * @since : 1.0
 **/
public class HungrySingleton {
    private  final  static  HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }
    public  static HungrySingleton  getSingeleton(){
        return HUNGRY_SINGLETON;
    }
}
