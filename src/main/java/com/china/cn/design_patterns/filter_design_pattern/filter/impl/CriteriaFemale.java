package com.china.cn.design_patterns.filter_design_pattern.filter.impl;

import com.china.cn.design_patterns.filter_design_pattern.filter.Criteria;
import com.china.cn.design_patterns.filter_design_pattern.pojo.Person;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 过滤器实现，过滤女性
 * @ClassName: CriteriaFemale
 * @Author: bin.ji
 * @Date: 2018-10-06 13:41
 * @Version: 1.0.0.0
 */

public class CriteriaFemale implements Criteria {
    
    /**
     * 过滤女性
     * @param list
     * @return
     */
    @Override
    public List<Person> criteria(List<Person> list) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : list){
            if (person.getGender().equalsIgnoreCase("female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
