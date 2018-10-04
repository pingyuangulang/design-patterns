package com.china.cn.design_patterns.abstract_factory_design_pattern.test;

import com.china.cn.design_patterns.abstract_factory_design_pattern.abstract_factory.AbstractFactory;
import com.china.cn.design_patterns.abstract_factory_design_pattern.enums.ColorEnum;
import com.china.cn.design_patterns.abstract_factory_design_pattern.enums.FactoryEnum;
import com.china.cn.design_patterns.abstract_factory_design_pattern.enums.ShapeEnum;
import com.china.cn.design_patterns.abstract_factory_design_pattern.factory_producer.FactoryProducer;

/**
 * @Description: TODO
 * @ClassName: Main
 * @Author: bin.ji
 * @Date: 2018-10-05 00:04
 * @Version: 1.0.0.0
 */

public class Main {

    public static void main(String[] srgs){
        AbstractFactory shapeFactory = FactoryProducer.createFactoryInstance(FactoryEnum.SHAPE);
        AbstractFactory colorFactory = FactoryProducer.createFactoryInstance(FactoryEnum.COLOR);
        String[] shapes = {"rectangle","square","circle"};
        String[] colors = {"red","green","blue"};
        System.out.println("==============================图形===============================");
        for (String shape : shapes){
            shapeFactory.createShapeInstance(ShapeEnum.getInstanceByCode(shape)).draw();
        }
        System.out.println("==============================颜色===============================");
        for (String color : colors){
            colorFactory.createColorInstance(ColorEnum.getInstanceByCode(color)).fill();
        }
    }
}
