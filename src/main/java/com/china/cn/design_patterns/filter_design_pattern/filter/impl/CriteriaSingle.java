package com.china.cn.design_patterns.filter_design_pattern.filter.impl;

import com.china.cn.design_patterns.filter_design_pattern.filter.Criteria;
import com.china.cn.design_patterns.filter_design_pattern.pojo.Person;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 过滤器实现，过滤单身
 * @ClassName: CriteriaSingle
 * @Author: bin.ji
 * @Date: 2018-10-06 13:46
 * @Version: 1.0.0.0
 */

public class CriteriaSingle implements Criteria {
    
    /**
     * 过滤单身
     * @param list
     * @return
     */
    @Override
    public List<Person> criteria(List<Person> list) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : list){
            if (person.getStatus().equalsIgnoreCase("single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
