package com.china.cn.design_patterns.factory_design_pattern.entity.impl;

import com.china.cn.design_patterns.factory_design_pattern.entity.Shape;

/**
 * @Description: TODO
 * @ClassName: Circle
 * @Author: bin.ji
 * @Date: 2018-10-04 21:53
 * @Version: 1.0.0.0
 */

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("ClassName={"+Circle.class+"}圆形");
    }
}
