package com.china.cn.design_patterns.abstract_factory_design_pattern.abstract_factory;

import com.china.cn.design_patterns.abstract_factory_design_pattern.color_entity.Color;
import com.china.cn.design_patterns.abstract_factory_design_pattern.enums.ColorEnum;
import com.china.cn.design_patterns.abstract_factory_design_pattern.enums.ShapeEnum;
import com.china.cn.design_patterns.abstract_factory_design_pattern.shape_entity.Shape;

/**
 * @Description: 抽象工厂
 * @ClassName: AbstractFactory
 * @Author: bin.ji
 * @Date: 2018-10-04 23:17
 * @Version: 1.0.0.0
 */

public abstract class AbstractFactory {

    /**
     * 创建颜色对象
     * @param colorEnum
     * @return
     */
    public abstract Color createColorInstance(ColorEnum colorEnum);

    /**
     * 创建图形对象
     * @param shapeEnum
     * @return
     */
    public abstract Shape createShapeInstance(ShapeEnum shapeEnum);
}
