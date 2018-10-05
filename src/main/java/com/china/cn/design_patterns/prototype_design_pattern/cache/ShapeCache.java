package com.china.cn.design_patterns.prototype_design_pattern.cache;

import com.china.cn.design_patterns.prototype_design_pattern.prototype.Shape;
import com.china.cn.design_patterns.prototype_design_pattern.prototype.impl.*;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Description: 图形对象缓存容器
 * @ClassName: ShapeCache
 * @Author: bin.ji
 * @Date: 2018-10-05 18:19
 * @Version: 1.0.0.0
 */

public class ShapeCache {

    /**缓存*/
    private static Map<String,Shape> cache = new Hashtable<>();
    
    /**
     * 将数据加载到缓存
     */
    public static void loadCache(){
        Shape circle = new Circle();
        cache.put(circle.getType(), circle);
    
        Shape rectangle = new Rectangle();
        cache.put(rectangle.getType(),rectangle);
        
        Shape square = new Square();
        cache.put(square.getType(),square);
    }
    
    /**
     * 根据图形类型获取对应对象
     * @param shapeType
     * @return
     */
    public static Shape getCloneShape(String shapeType){
        Shape cacheShape = cache.get(shapeType);
        return (Shape)cacheShape.clone();
    }
}
