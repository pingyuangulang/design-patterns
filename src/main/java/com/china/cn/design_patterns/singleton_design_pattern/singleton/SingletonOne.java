package com.china.cn.design_patterns.singleton_design_pattern.singleton;
/**
 * @Description: 饿汉式
 * @ClassName: SingletonOne
 * @Author: bin.ji
 * @Date: 2018-10-05 14:00
 * @Version: 1.0.0.0
 */

public class SingletonOne {
    
    private static SingletonOne instance = new SingletonOne();
    
    private SingletonOne(){}
    
    public static SingletonOne getInstance(){
        return instance;
    }
}
