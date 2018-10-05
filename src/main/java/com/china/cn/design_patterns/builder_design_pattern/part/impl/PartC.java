package com.china.cn.design_patterns.builder_design_pattern.part.impl;

import com.china.cn.design_patterns.builder_design_pattern.part.Part;

/**
 * @Description: 具体部件C
 * @ClassName: PartC
 * @Author: bin.ji
 * @Date: 2018-10-05 15:22
 * @Version: 1.0.0.0
 */

public class PartC implements Part {

    private String name;
    private String desc;
    
    public PartC() {
        this.name = PartC.class.toString();
        this.desc = "made in China";
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    @Override
    public String toString() {
        return "PartC{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
