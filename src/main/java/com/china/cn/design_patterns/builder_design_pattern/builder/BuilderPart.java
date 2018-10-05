package com.china.cn.design_patterns.builder_design_pattern.builder;

import com.china.cn.design_patterns.builder_design_pattern.part.Part;
import com.china.cn.design_patterns.builder_design_pattern.part.impl.PartA;
import com.china.cn.design_patterns.builder_design_pattern.part.impl.PartB;
import com.china.cn.design_patterns.builder_design_pattern.part.impl.PartC;

/**
 * @Description: builder实现（创建汽车的各个部件）
 * @ClassName: BuilderPart
 * @Author: bin.ji
 * @Date: 2018-10-05 15:29
 * @Version: 1.0.0.0
 */

public class BuilderPart implements Builder{

    /**各个部件资源*/
    private Part partA,partB,partC;
    
    @Override
    public Part builderPartA() {
        partA = new PartA();
        System.out.println("A部件创造完毕："+partA.toString());
        return partA;
    }
    
    @Override
    public Part builderPartB() {
        partB = new PartB();
        System.out.println("B部件创造完毕："+partB.toString());
        return partB;
    }
    
    @Override
    public Part builderPartC() {
        partC = new PartC();
        System.out.println("C部件创造完毕："+partC.toString());
        return partC;
    }
}
