package com.china.cn.design_patterns.factory_design_pattern.entity.impl;

import com.china.cn.design_patterns.factory_design_pattern.entity.Shape;

/**
 * @Description: TODO
 * @ClassName: Square
 * @author bin.ji
 * @Date: 2018-10-04 21:50
 * @Version: 1.0.0.0
 */

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("ClassName={"+Square.class+"}正方形");
    }
}
