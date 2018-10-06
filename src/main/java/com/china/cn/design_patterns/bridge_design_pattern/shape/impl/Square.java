package com.china.cn.design_patterns.bridge_design_pattern.shape.impl;

import com.china.cn.design_patterns.bridge_design_pattern.bridge.DrawAPI;
import com.china.cn.design_patterns.bridge_design_pattern.shape.Shape;

/**
 * @Description: TODO
 * @ClassName: Square
 * @Author: bin.ji
 * @Date: 2018-10-06 12:51
 * @Version: 1.0.0.0
 */

public class Square extends Shape {
    
    private float x,y;
    
    public Square(DrawAPI drawAPI, float x, float y) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void draw() {
        drawAPI.drawShape();
    }
}
