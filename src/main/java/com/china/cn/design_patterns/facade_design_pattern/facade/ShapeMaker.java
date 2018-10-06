package com.china.cn.design_patterns.facade_design_pattern.facade;

import com.china.cn.design_patterns.facade_design_pattern.shape.Shape;
import com.china.cn.design_patterns.facade_design_pattern.shape.impl.Circle;
import com.china.cn.design_patterns.facade_design_pattern.shape.impl.Rectangle;
import com.china.cn.design_patterns.facade_design_pattern.shape.impl.Square;

/**
 * @Description: 图形对象对外暴露的外观
 * @ClassName: ShapeMaker
 * @Author: bin.ji
 * @Date: 2018-10-06 18:43
 * @Version: 1.0.0.0
 */

public class ShapeMaker {

    private Shape circle;
    private Shape square;
    private Shape rectangle;
    
    /**
     * 构造器
     */
    public ShapeMaker(){
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }
    
    /**
     * 画圆
     */
    public void drawCircle(){
        System.out.println("ClassName:{"+this.getClass().toString()+"}图像制作-->圆形");
        circle.draw();
    }
    
    /**
     * 画正方形
     */
    public void drawSquare(){
        System.out.println("ClassName:{"+this.getClass().toString()+"}图像制作-->正方形");
        square.draw();
    }
    
    /**
     * 画长方形
     */
    public void drawRectangle(){
        System.out.println("ClassName:{"+this.getClass().toString()+"}图像制作-->长方形");
        rectangle.draw();
    }
}
