package com.china.cn.design_patterns.abstract_factory_design_pattern.abstract_factory.impl;

import com.china.cn.design_patterns.abstract_factory_design_pattern.abstract_factory.AbstractFactory;
import com.china.cn.design_patterns.abstract_factory_design_pattern.color_entity.Color;
import com.china.cn.design_patterns.abstract_factory_design_pattern.enums.ColorEnum;
import com.china.cn.design_patterns.abstract_factory_design_pattern.enums.ShapeEnum;
import com.china.cn.design_patterns.abstract_factory_design_pattern.shape_entity.Shape;
import com.china.cn.design_patterns.abstract_factory_design_pattern.shape_entity.impl.*;

/**
 * @Description: 图形对象创建工厂
 * @ClassName: ShapeFactory
 * @Author: bin.ji
 * @Date: 2018-10-04 23:41
 * @Version: 1.0.0.0
 */

public class ShapeFactory extends AbstractFactory {

    /**
     * 创建图形对象
     * @param shapeEnum
     * @return
     */
    @Override
    public Shape createShapeInstance(ShapeEnum shapeEnum) {
        if (ShapeEnum.CIRCLE.equals(shapeEnum)){
            return new Circle();
        }
        if (ShapeEnum.RECTANGLE.equals(shapeEnum)){
            return new Rectangle();
        }
        if (ShapeEnum.SQUARE.equals(shapeEnum)){
            return new Square();
        }
        return null;
    }

    /**
     * 图形工厂不能创建颜色对象，所以置为空
     * @param colorEnum
     * @return
     */
    @Override
    public Color createColorInstance(ColorEnum colorEnum){
        return null;
    }
}
