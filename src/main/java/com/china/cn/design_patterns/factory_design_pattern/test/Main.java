package com.china.cn.design_patterns.factory_design_pattern.test;

import com.china.cn.design_patterns.factory_design_pattern.entityenum.EntityEnum;
import com.china.cn.design_patterns.factory_design_pattern.factory.ShapeFactory;

/**
 * @Description: 主测试类
 * @ClassName: Main
 * @Author: bin.ji
 * @Date: 2018-10-04 22:37
 * @Version: 1.0.0.0
 */

public class Main {

    public static void main(String[] args){
        String[] shapes = {"rectangle","square","circle"};
        for (String str : shapes){
            ShapeFactory.createShape(EntityEnum.getInstanceByCode(str)).draw();
        }
    }
}
