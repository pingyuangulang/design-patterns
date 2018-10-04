package com.china.cn.design_patterns.abstract_factory_design_pattern.factory_producer;

import com.china.cn.design_patterns.abstract_factory_design_pattern.abstract_factory.AbstractFactory;
import com.china.cn.design_patterns.abstract_factory_design_pattern.abstract_factory.impl.ColorFactory;
import com.china.cn.design_patterns.abstract_factory_design_pattern.abstract_factory.impl.ShapeFactory;
import com.china.cn.design_patterns.abstract_factory_design_pattern.enums.FactoryEnum;

/**
 * @Description: 生产工厂的工厂，工厂生产器
 * @ClassName: FactoryProducer
 * @Author: bin.ji
 * @Date: 2018-10-04 23:56
 * @Version: 1.0.0.0
 */

public class FactoryProducer {

    /**
     * 创建图形/颜色工厂
     * @param factoryEnum
     * @return
     */
    public static AbstractFactory createFactoryInstance(FactoryEnum factoryEnum){
        if (FactoryEnum.COLOR.equals(factoryEnum)){
            return new ColorFactory();
        }
        if (FactoryEnum.SHAPE.equals(factoryEnum)){
            return new ShapeFactory();
        }
        return null;
    }
}
