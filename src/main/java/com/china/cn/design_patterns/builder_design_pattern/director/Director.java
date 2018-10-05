package com.china.cn.design_patterns.builder_design_pattern.director;

import com.china.cn.design_patterns.builder_design_pattern.builder.Builder;
import com.china.cn.design_patterns.builder_design_pattern.part.Part;
import com.china.cn.design_patterns.builder_design_pattern.product.Product;
import com.china.cn.design_patterns.builder_design_pattern.product.impl.Car;

/**
 * @Description: 将各个部件组装成一辆汽车
 * @ClassName: Director
 * @Author: bin.ji
 * @Date: 2018-10-05 15:36
 * @Version: 1.0.0.0
 */

public class Director {
    
    /**
     * 引入建造工厂
     */
    private Builder builder;
    
    /**
     * 构造器
     * @param builder
     */
    public Director(Builder builder){
        this.builder = builder;
    }
    
    /**
     * 将部件组装成产品
     * @return
     */
    public Product construct(){
        Part partA = builder.builderPartA();
        Part partB = builder.builderPartB();
        Part partC = builder.builderPartC();
        System.out.println("=========组装完毕，产品即将诞生==========");
        Product product = new Car(partA,partB,partC);
        System.out.println("产品诞生:"+product.toString());
        return product;
    }
}
