package com.china.cn.design_patterns.prototype_design_pattern.prototype.impl;

import com.china.cn.design_patterns.prototype_design_pattern.prototype.Shape;

/**
 * @Description: TODO
 * @ClassName: Circle
 * @Author: bin.ji
 * @Date: 2018-10-04 21:53
 * @Version: 1.0.0.0
 */

public class Circle extends Shape {
    /**构造器*/
    public Circle() {
        this.type = "Circle";
    }
    
    @Override
    public void draw() {
        System.out.println("ClassName={"+ Circle.class+"}圆形");
    }
}
