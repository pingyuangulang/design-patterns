package com.china.cn.design_patterns.filter_design_pattern.test;

import com.china.cn.design_patterns.filter_design_pattern.filter.Criteria;
import com.china.cn.design_patterns.filter_design_pattern.filter.impl.*;
import com.china.cn.design_patterns.filter_design_pattern.pojo.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @ClassName: Main
 * @Author: bin.ji
 * @Date: 2018-10-06 14:03
 * @Version: 1.0.0.0
 */

public class Main {

    public static void main(String[] args){
        List<Person> list = createList();
        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria and = new AndCriteria(male,single);
        Criteria or = new OrCriteria(female,single);
        print("male",male.criteria(list));
        print("female",female.criteria(list));
        print("single",single.criteria(list));
        print("and",and.criteria(list));
        print("or",or.criteria(list));
    }
    
    private static List<Person> createList(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Robert","Male", "Single"));
        personList.add(new Person("John", "Male", "Married"));
        personList.add(new Person("Laura", "Female", "Married"));
        personList.add(new Person("Diana", "Female", "Single"));
        personList.add(new Person("Mike", "Male", "Single"));
        personList.add(new Person("Bobby", "Male", "Single"));
        return personList;
    }
    
    private static void print(String filter, List<Person> list){
        System.out.println("==============="+filter+"===============");
        for (Person person : list){
            System.out.println(person.toString());
        }
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println();
    }
}
