package com.china.cn.design_patterns.facade_design_pattern.shape.impl;

import com.china.cn.design_patterns.facade_design_pattern.shape.Shape;

/**
 * @Description: TODO
 * @ClassName: Square
 * @Author: bin.ji
 * @Date: 2018-10-06 18:40
 * @Version: 1.0.0.0
 */

public class Square implements Shape {
    
    @Override
    public void draw() {
        System.out.println("ClassName:{"+Square.class.toString()+"}正方形");
    }
}
