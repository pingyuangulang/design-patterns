package com.china.cn.design_patterns.singleton_design_pattern.singleton;
/**
 * @Description: 懒汉式
 * @ClassName: SingletonTwo
 * @Author: bin.ji
 * @Date: 2018-10-05 14:03
 * @Version: 1.0.0.0
 */

public class SingletonTwo {
    
    private static SingletonTwo instance;
    
    private SingletonTwo(){}
    
    public static SingletonTwo getInstance(){
        if (instance == null){
            synchronized (SingletonTwo.class){
                if (instance == null){
                    instance = new SingletonTwo();
                }
                return instance;
            }
        }else {
            return instance;
        }
    }
}
