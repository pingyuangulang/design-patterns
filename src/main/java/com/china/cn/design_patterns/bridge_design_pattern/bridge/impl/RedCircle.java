package com.china.cn.design_patterns.bridge_design_pattern.bridge.impl;

import com.china.cn.design_patterns.bridge_design_pattern.bridge.DrawAPI;

/**
 * @Description: 桥接模式实现
 * @ClassName: RedCircle
 * @Author: bin.ji
 * @Date: 2018-10-06 12:57
 * @Version: 1.0.0.0
 */

public class RedCircle implements DrawAPI {
    
    @Override
    public void drawShape() {
        System.out.println("ClassName:{"+RedCircle.class.toString()+"}红色圆形");
    }
}
