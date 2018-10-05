package com.china.cn.design_patterns.builder_design_pattern.product.impl;

import com.china.cn.design_patterns.builder_design_pattern.part.Part;
import com.china.cn.design_patterns.builder_design_pattern.product.Product;

/**
 * @Description: 汽车产品
 * @ClassName: Car
 * @Author: bin.ji
 * @Date: 2018-10-05 15:46
 * @Version: 1.0.0.0
 */

public class Car implements Product {

    private Part partA,partB,partC;
    
    public Car() {
    }
    
    public Car(Part partA, Part partB, Part partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }
    
    public Part getPartA() {
        return partA;
    }
    
    public void setPartA(Part partA) {
        this.partA = partA;
    }
    
    public Part getPartB() {
        return partB;
    }
    
    public void setPartB(Part partB) {
        this.partB = partB;
    }
    
    public Part getPartC() {
        return partC;
    }
    
    public void setPartC(Part partC) {
        this.partC = partC;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "partA=" + partA.toString() +
                ", partB=" + partB.toString() +
                ", partC=" + partC.toString() +
                '}';
    }
}
