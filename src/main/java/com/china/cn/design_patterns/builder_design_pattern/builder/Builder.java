package com.china.cn.design_patterns.builder_design_pattern.builder;

import com.china.cn.design_patterns.builder_design_pattern.part.Part;

/**
 * @Description: builder模式
 * @ClassName: Builder
 * @Author: bin.ji
 * @Date: 2018-10-05 15:26
 * @Version: 1.0.0.0
 */

public interface Builder {
    
    /**
     * 创建部件A
     * @return
     */
    Part builderPartA();
    
    /**
     * 创建部件B
     * @return
     */
    Part builderPartB();
    
    /**
     * 创建部件C
     * @return
     */
    Part builderPartC();
}
