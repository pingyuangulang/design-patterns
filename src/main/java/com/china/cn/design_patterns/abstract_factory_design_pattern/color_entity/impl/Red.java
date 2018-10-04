package com.china.cn.design_patterns.abstract_factory_design_pattern.color_entity.impl;

import com.china.cn.design_patterns.abstract_factory_design_pattern.color_entity.Color;

/**
 * @Description: TODO
 * @ClassName: Red
 * @Author: bin.ji
 * @Date: 2018-10-04 23:11
 * @Version: 1.0.0.0
 */

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("ColorClassName={"+Red.class+"}红色");
    }
}
