package com.china.cn.design_patterns.prototype_design_pattern.prototype;
/**
 * @Description: 图形抽象类，提供克隆方法
 * @ClassName: Shape
 * @Author: bin.ji
 * @Date: 2018-10-05 18:04
 * @Version: 1.0.0.0
 */

public abstract class Shape implements Cloneable{

    /**图形类型*/
    protected String type;
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     *画图方法
     */
    public abstract void draw();
    
    /**
     * 克隆方法
     * @return
     */
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
