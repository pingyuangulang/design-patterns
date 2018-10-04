package com.china.cn.design_patterns.abstract_factory_design_pattern.enums;

/**
 * @Description: 工厂枚举类
 * @ClassName: FactoryEnum
 * @Author: bin.ji
 * @Date: 2018-10-04 23:36
 * @Version: 1.0.0.0
 */

public enum  FactoryEnum {

    /**颜色*/
    COLOR("color","颜色"),
    /**图形*/
    SHAPE("shape","图形");

    /**标识码*/
    private String code;
    /**描述*/
    private String desc;

    /**
     * 枚举构造器
     * @param code
     * @param desc
     */
    FactoryEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 根据标识码获取枚举对象
     * @param code
     * @return
     */
    public static FactoryEnum getInstanceByCode(String code){
        FactoryEnum[] factoryEnums = FactoryEnum.values();
        for (FactoryEnum factoryEnum : factoryEnums){
            if (factoryEnum.getCode().equals(code)){
                return factoryEnum;
            }
        }
        return null;
    }
}
