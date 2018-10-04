package com.china.cn.design_patterns.factory_design_pattern.factory;

import com.china.cn.design_patterns.factory_design_pattern.entity.Shape;
import com.china.cn.design_patterns.factory_design_pattern.entity.impl.*;
import com.china.cn.design_patterns.factory_design_pattern.entityenum.EntityEnum;

/**
 * @Description: 创建图形对象的工厂类
 * @ClassName: ShapeFactory
 * @Author: bin.ji
 * @Date: 2018-10-04 22:28
 * @Version: 1.0.0.0
 */

public class ShapeFactory {

    /**
     * 创建图形对象的工厂方法
     * @param entityEnum
     * @return
     */
    public static final Shape createShape(EntityEnum entityEnum){
        if (EntityEnum.CIRCLE.equals(entityEnum)){
            return new Circle();
        }
        if (EntityEnum.RECTANGLE.equals(entityEnum)){
            return new Rectangle();
        }
        if (EntityEnum.SQUARE.equals(entityEnum)){
            return new Square();
        }
        return null;
    }
}
