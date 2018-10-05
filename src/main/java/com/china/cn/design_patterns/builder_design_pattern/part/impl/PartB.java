package com.china.cn.design_patterns.builder_design_pattern.part.impl;

import com.china.cn.design_patterns.builder_design_pattern.part.Part;

/**
 * @Description: 具体的部件B
 * @ClassName: PartB
 * @Author: bin.ji
 * @Date: 2018-10-05 15:19
 * @Version: 1.0.0.0
 */

public class PartB implements Part {

    private String name;
    private Float price;
    
    public PartB(){
        this.name = PartB.class.toString();
        this.price = 66.6f;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Float getPrice() {
        return price;
    }
    
    public void setPrice(Float price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "PartB{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
