package com.china.cn.design_patterns.bridge_design_pattern.bridge.impl;

import com.china.cn.design_patterns.bridge_design_pattern.bridge.DrawAPI;

/**
 * @Description: 桥接模式实现
 * @ClassName: GreenSquare
 * @Author: bin.ji
 * @Date: 2018-10-06 13:02
 * @Version: 1.0.0.0
 */

public class GreenSquare implements DrawAPI {
    
    @Override
    public void drawShape() {
        System.out.println("ClassName:{"+GreenSquare.class.toString()+"}绿色方形");
    }
}
