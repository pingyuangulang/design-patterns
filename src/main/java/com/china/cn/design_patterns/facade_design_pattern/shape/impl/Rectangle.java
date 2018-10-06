package com.china.cn.design_patterns.facade_design_pattern.shape.impl;

import com.china.cn.design_patterns.facade_design_pattern.shape.Shape;

/**
 * @Description: TODO
 * @ClassName: Rectangle
 * @Author: bin.ji
 * @Date: 2018-10-06 18:42
 * @Version: 1.0.0.0
 */

public class Rectangle implements Shape {
    
    @Override
    public void draw() {
        System.out.println("ClassName:{"+Rectangle.class.toString()+"}长方形");
    }
}
