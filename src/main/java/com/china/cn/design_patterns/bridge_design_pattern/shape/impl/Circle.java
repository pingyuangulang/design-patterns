package com.china.cn.design_patterns.bridge_design_pattern.shape.impl;

import com.china.cn.design_patterns.bridge_design_pattern.bridge.DrawAPI;
import com.china.cn.design_patterns.bridge_design_pattern.shape.Shape;

/**
 * @Description: TODO
 * @ClassName: Circle
 * @Author: bin.ji
 * @Date: 2018-10-06 12:54
 * @Version: 1.0.0.0
 */

public class Circle extends Shape {

    private float x,y,z;
    
    public Circle(DrawAPI drawAPI, float x, float y, float z) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public void draw() {
        drawAPI.drawShape();
    }
}
