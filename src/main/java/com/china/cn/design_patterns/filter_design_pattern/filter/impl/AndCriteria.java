package com.china.cn.design_patterns.filter_design_pattern.filter.impl;

import com.china.cn.design_patterns.filter_design_pattern.filter.Criteria;
import com.china.cn.design_patterns.filter_design_pattern.pojo.Person;
import java.util.List;

/**
 * @Description: 过滤器实现，对两个过滤条件取与运算
 * @ClassName: AndCriteria
 * @Author: bin.ji
 * @Date: 2018-10-06 13:49
 * @Version: 1.0.0.0
 */

public class AndCriteria implements Criteria {
    
    /**两个过滤器*/
    private Criteria criteria;
    private Criteria otherCriteria;
    
    /**
     * 构造器
     * @param criteria
     * @param otherCriteria
     */
    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    
    /**
     * 过滤方法
     * @param list
     * @return
     */
    @Override
    public List<Person> criteria(List<Person> list) {
        List<Person> firstList = null;
        List<Person> secondList = null;
        firstList = criteria.criteria(list);
        secondList = otherCriteria.criteria(firstList);
        return secondList;
    }
}
