package com.example.demo.pattern.singleton;

/**
 * description: TODO
 * date: 2020/1/11 0011 下午 22:52
 *
 * @author : Administrator
 * @since : 1.0
 **/
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_SINGLETON_THREAD_LOCAL
            = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL_SINGLETON_THREAD_LOCAL.get();
    }
}
