package com.china.cn.design_patterns.filter_design_pattern.filter;

import com.china.cn.design_patterns.filter_design_pattern.pojo.Person;

import java.util.List;

/**
 * @Description: 过滤器（条件）模式接口
 * @ClassName: Criteria
 * @Author: bin.ji
 * @Date: 2018-10-06 13:33
 * @Version: 1.0.0.0
 */

public interface Criteria {
    
    /**
     * 对Person对象进行过滤
     * @param list
     * @return
     */
    List<Person> criteria(List<Person> list);
}
