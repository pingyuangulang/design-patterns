package com.china.cn.design_patterns.filter_design_pattern.pojo;
/**
 * @Description: 实体类
 * @ClassName: Person
 * @Author: bin.ji
 * @Date: 2018-10-06 13:30
 * @Version: 1.0.0.0
 */

public class Person {

    private String name;
    private String gender;
    private String status;
    
    public Person(String name, String gender, String status) {
        this.name = name;
        this.gender = gender;
        this.status = status;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
