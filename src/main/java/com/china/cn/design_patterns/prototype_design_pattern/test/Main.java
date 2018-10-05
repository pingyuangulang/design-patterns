package com.china.cn.design_patterns.prototype_design_pattern.test;

import com.china.cn.design_patterns.prototype_design_pattern.cache.ShapeCache;
import com.china.cn.design_patterns.prototype_design_pattern.prototype.Shape;

/**
 * @Description: TODO
 * @ClassName: Main
 * @Author: bin.ji
 * @Date: 2018-10-05 18:34
 * @Version: 1.0.0.0
 */

public class Main {

    public static void main(String[] args){
        ShapeCache.loadCache();
        String[] types = {"Circle","Rectangle","Square"};
        for (String type : types){
            Shape shape = ShapeCache.getCloneShape(type);
            shape.draw();
        }
    }
}
