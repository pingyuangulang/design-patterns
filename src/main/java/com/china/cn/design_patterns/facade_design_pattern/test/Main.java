package com.china.cn.design_patterns.facade_design_pattern.test;

import com.china.cn.design_patterns.facade_design_pattern.facade.ShapeMaker;

/**
 * @Description: TODO
 * @ClassName: Main
 * @Author: bin.ji
 * @Date: 2018-10-06 18:52
 * @Version: 1.0.0.0
 */

public class Main {

    public static void main(String[] args){
        ShapeMaker maker = new ShapeMaker();
        maker.drawCircle();
        maker.drawSquare();
        maker.drawRectangle();
    }
}
