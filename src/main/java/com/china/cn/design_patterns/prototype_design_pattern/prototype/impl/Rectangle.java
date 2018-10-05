package com.china.cn.design_patterns.prototype_design_pattern.prototype.impl;

import com.china.cn.design_patterns.prototype_design_pattern.prototype.Shape;

/**
 * @Description: TODO
 * @ClassName: Rectangle
 * @Author: bin.ji
 * @Date: 2018-10-04 21:55
 * @Version: 1.0.0.0
 */

public class Rectangle extends Shape {
    /**构造器*/
    public Rectangle() {
        this.type = "Rectangle";
    }
    
    @Override
    public void draw() {
        System.out.println("ClassName={"+ Rectangle.class+"}长方形");
    }
}
