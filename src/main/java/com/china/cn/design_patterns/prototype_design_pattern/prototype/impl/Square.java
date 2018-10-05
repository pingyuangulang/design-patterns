package com.china.cn.design_patterns.prototype_design_pattern.prototype.impl;


import com.china.cn.design_patterns.prototype_design_pattern.prototype.Shape;

/**
 * @Description: TODO
 * @ClassName: Square
 * @author bin.ji
 * @Date: 2018-10-04 21:50
 * @Version: 1.0.0.0
 */

public class Square extends Shape {
    /**构造器*/
    public Square() {
        this.type = "Square";
    }
    
    @Override
    public void draw() {
        System.out.println("ClassName={"+ Square.class+"}正方形");
    }
}
