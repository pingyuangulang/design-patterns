package com.china.cn.design_patterns.decorator_design_pattern.decorator.impl;

import com.china.cn.design_patterns.decorator_design_pattern.decorator.Decorator;
import com.china.cn.design_patterns.decorator_design_pattern.shape.Shape;

/**
 * @Description: 装饰者实现类
 * @ClassName: ShapeDecorator
 * @Author: bin.ji
 * @Date: 2018-10-06 18:20
 * @Version: 1.0.0.0
 */

public class ShapeDecorator extends Decorator {
    
    public ShapeDecorator(Shape shape){
        super(shape);
    }
    
    @Override
    public void draw() {
        System.out.println("画图功能增强");
        shape.draw();
        System.out.println("============================================");
    }
}
