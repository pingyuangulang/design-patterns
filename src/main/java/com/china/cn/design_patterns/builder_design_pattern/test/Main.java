package com.china.cn.design_patterns.builder_design_pattern.test;

import com.china.cn.design_patterns.builder_design_pattern.builder.Builder;
import com.china.cn.design_patterns.builder_design_pattern.builder.BuilderPart;
import com.china.cn.design_patterns.builder_design_pattern.director.Director;

/**
 * @Description: TODO
 * @ClassName: Main
 * @Author: bin.ji
 * @Date: 2018-10-05 15:51
 * @Version: 1.0.0.0
 */

public class Main {

    public static void main(String[] args){
        Builder builder = new BuilderPart();
        Director director = new Director(builder);
        director.construct();
    }
}
