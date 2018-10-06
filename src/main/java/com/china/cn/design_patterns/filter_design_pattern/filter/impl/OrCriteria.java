package com.china.cn.design_patterns.filter_design_pattern.filter.impl;

import com.china.cn.design_patterns.filter_design_pattern.filter.Criteria;
import com.china.cn.design_patterns.filter_design_pattern.pojo.Person;
import java.util.List;

/**
 * @Description: 过滤器实现，对两个过滤条件取或运算
 * @ClassName: OrCriteria
 * @Author: bin.ji
 * @Date: 2018-10-06 13:56
 * @Version: 1.0.0.0
 */

public class OrCriteria implements Criteria {
    
    /**两个过滤器*/
    private Criteria criteria;
    private Criteria otherCriteria;
    
    /**
     * 构造器
     * @param criteria
     * @param otherCriteria
     */
    public OrCriteria(Criteria criteria, Criteria otherCriteria){
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
        List<Person> resultList = null;
        resultList = criteria.criteria(list);
        List<Person> temp = otherCriteria.criteria(list);
        for (Person person : temp){
            if (!resultList.contains(person)){
                resultList.add(person);
            }
        }
        return resultList;
    }
}
