package com.china.cn.design_patterns.facade_design_pattern.shape.impl;

import com.china.cn.design_patterns.facade_design_pattern.shape.Shape;

/**
 * @Description: TODO
 * @ClassName: Circle
 * @Author: bin.ji
 * @Date: 2018-10-06 18:39
 * @Version: 1.0.0.0
 */

public class Circle implements Shape {
    
    @Override
    public void draw() {
        System.out.println("ClassName:{"+Circle.class.toString()+"}圆形");
    }
}
