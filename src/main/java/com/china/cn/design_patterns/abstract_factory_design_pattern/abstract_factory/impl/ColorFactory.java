package com.china.cn.design_patterns.abstract_factory_design_pattern.abstract_factory.impl;

import com.china.cn.design_patterns.abstract_factory_design_pattern.abstract_factory.AbstractFactory;
import com.china.cn.design_patterns.abstract_factory_design_pattern.color_entity.Color;
import com.china.cn.design_patterns.abstract_factory_design_pattern.color_entity.impl.Blue;
import com.china.cn.design_patterns.abstract_factory_design_pattern.color_entity.impl.Green;
import com.china.cn.design_patterns.abstract_factory_design_pattern.color_entity.impl.Red;
import com.china.cn.design_patterns.abstract_factory_design_pattern.enums.ColorEnum;
import com.china.cn.design_patterns.abstract_factory_design_pattern.enums.ShapeEnum;
import com.china.cn.design_patterns.abstract_factory_design_pattern.shape_entity.Shape;

/**
 * @Description: 颜色对象创建工厂
 * @ClassName: ColorFactory
 * @Author: bin.ji
 * @Date: 2018-10-04 23:49
 * @Version: 1.0.0.0
 */

public class ColorFactory extends AbstractFactory {

    /**
     * 创建颜色对象
     * @param colorEnum
     * @return
     */
    @Override
    public Color createColorInstance(ColorEnum colorEnum) {
        if (ColorEnum.RED.equals(colorEnum)){
            return new Red();
        }
        if (ColorEnum.BLUE.equals(colorEnum)){
            return new Blue();
        }
        if (ColorEnum.GREEN.equals(colorEnum)){
            return new Green();
        }
        return null;
    }

    /**
     * 颜色工厂不能创建图形对象，所以置为空
     * @param shapeEnum
     * @return
     */
    @Override
    public Shape createShapeInstance(ShapeEnum shapeEnum) {
        return null;
    }
}
