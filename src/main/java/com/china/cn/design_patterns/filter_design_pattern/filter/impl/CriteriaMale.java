package com.china.cn.design_patterns.filter_design_pattern.filter.impl;

import com.china.cn.design_patterns.filter_design_pattern.filter.Criteria;
import com.china.cn.design_patterns.filter_design_pattern.pojo.Person;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 过滤器实现，过滤男性
 * @ClassName: CriteriaMale
 * @Author: bin.ji
 * @Date: 2018-10-06 13:35
 * @Version: 1.0.0.0
 */

public class CriteriaMale implements Criteria{
    
    /**
     * 过滤男性
     * @param list
     * @return
     */
    @Override
    public List<Person> criteria(List<Person> list) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : list){
            if (person.getGender().equalsIgnoreCase("male")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
