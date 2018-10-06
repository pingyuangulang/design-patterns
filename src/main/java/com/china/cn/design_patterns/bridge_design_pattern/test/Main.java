package com.china.cn.design_patterns.bridge_design_pattern.test;

import com.china.cn.design_patterns.bridge_design_pattern.bridge.impl.GreenCircle;
import com.china.cn.design_patterns.bridge_design_pattern.bridge.impl.GreenSquare;
import com.china.cn.design_patterns.bridge_design_pattern.bridge.impl.RedCircle;
import com.china.cn.design_patterns.bridge_design_pattern.bridge.impl.RedSquare;
import com.china.cn.design_patterns.bridge_design_pattern.shape.Shape;
import com.china.cn.design_patterns.bridge_design_pattern.shape.impl.Circle;
import com.china.cn.design_patterns.bridge_design_pattern.shape.impl.Square;

/**
 * @Description: TODO
 * @ClassName: Main
 * @Author: bin.ji
 * @Date: 2018-10-06 13:04
 * @Version: 1.0.0.0
 */

public class Main {

    public static void main(String[] args){
        Shape redCircle = new Circle(new RedCircle(),1.0f,1.0f,1.0f);
        Shape greenCircle = new Circle(new GreenCircle(),1.0f,1.0f,1.0f);
        Shape redSquare = new Square(new RedSquare(),1.0f,1.0f);
        Shape greenSquare = new Square(new GreenSquare(),1.0f,1.0f);
        redCircle.draw();
        redSquare.draw();
        greenCircle.draw();
        greenSquare.draw();
    }
}
