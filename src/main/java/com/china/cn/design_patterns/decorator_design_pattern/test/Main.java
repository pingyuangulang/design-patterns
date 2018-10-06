package com.china.cn.design_patterns.decorator_design_pattern.test;

import com.china.cn.design_patterns.decorator_design_pattern.decorator.impl.ShapeDecorator;
import com.china.cn.design_patterns.decorator_design_pattern.shape.Shape;
import com.china.cn.design_patterns.decorator_design_pattern.shape.impl.*;

/**
 * @Description: TODO
 * @ClassName: Main
 * @Author: bin.ji
 * @Date: 2018-10-06 18:23
 * @Version: 1.0.0.0
 */

public class Main {

    public static void main(String[] args){
        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        new ShapeDecorator(circle).draw();
        new ShapeDecorator(square).draw();
        new ShapeDecorator(rectangle).draw();
    }
}
