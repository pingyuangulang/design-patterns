package com.china.cn.design_patterns.bridge_design_pattern.shape;

import com.china.cn.design_patterns.bridge_design_pattern.bridge.DrawAPI;

/**
 * @Description: 图形抽象类
 * @ClassName: Shape
 * @Author: bin.ji
 * @Date: 2018-10-06 12:45
 * @Version: 1.0.0.0
 */

public abstract class Shape {

    protected DrawAPI drawAPI;
    
    /**
     * 构造器
     * @param drawAPI
     */
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    
    /**
     * 画图方法
     */
    public abstract void draw();
}
