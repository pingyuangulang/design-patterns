package com.china.cn.design_patterns.builder_design_pattern.part.impl;

import com.china.cn.design_patterns.builder_design_pattern.part.Part;

/**
 * @Description: 具体的部件A
 * @ClassName: PartA
 * @Author: bin.ji
 * @Date: 2018-10-05 15:13
 * @Version: 1.0.0.0
 */

public class PartA implements Part {

    /**生产部件所需资源*/
    private String name;
    private Integer size;
    
    public PartA(){
        this.name = PartA.class.toString();
        this.size = 10;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getSize() {
        return size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        return "PartA{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
