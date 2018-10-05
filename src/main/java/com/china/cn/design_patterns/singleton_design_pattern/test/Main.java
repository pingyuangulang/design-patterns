package com.china.cn.design_patterns.singleton_design_pattern.test;

import com.china.cn.design_patterns.singleton_design_pattern.singleton.SingletonOne;
import com.china.cn.design_patterns.singleton_design_pattern.singleton.SingletonTwo;

/**
 * @Description: TODO
 * @ClassName: Main
 * @Author: bin.ji
 * @Date: 2018-10-05 14:08
 * @Version: 1.0.0.0
 */

public class Main {
    
    public static void main(String[] args){
        SingletonOne singletonOne1 = SingletonOne.getInstance();
        SingletonOne singletonOne2 = SingletonOne.getInstance();
        System.out.println("饿汉式，创建的两对象是否相等:{"+String.valueOf(singletonOne1==singletonOne2)+"}");
        SingletonTwo singletonTwo1 = SingletonTwo.getInstance();
        SingletonTwo singletonTwo2 = SingletonTwo.getInstance();
        System.out.println("懒汉式，创建的两对象是否相等:{"+String.valueOf(singletonTwo1==singletonTwo2)+"}");
    }
}
