package com.china.cn.design_patterns.abstract_factory_design_pattern.shape_entity.impl;

import com.china.cn.design_patterns.abstract_factory_design_pattern.shape_entity.Shape;
/**
 * @Description: TODO
 * @ClassName: Rectangle
 * @Author: bin.ji
 * @Date: 2018-10-04 21:55
 * @Version: 1.0.0.0
 */

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("ShapeClassName={"+ Rectangle.class+"}长方形");
    }
}
