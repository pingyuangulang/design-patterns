package com.china.cn.design_patterns.decorator_design_pattern.decorator;

import com.china.cn.design_patterns.decorator_design_pattern.shape.Shape;

/**
 * @Description: 装饰者抽象类
 * @ClassName: Decorator
 * @Author: bin.ji
 * @Date: 2018-10-06 18:18
 * @Version: 1.0.0.0
 */

public abstract class Decorator {

    protected Shape shape;
    
    protected Decorator(Shape shape){
        this.shape = shape;
    }
    
    public abstract void draw();
}
