package com.china.cn.design_patterns.abstract_factory_design_pattern.enums;

/**
 * @Description: 颜色枚举类
 * @ClassName: ColorEnum
 * @Author: bin.ji
 * @Date: 2018-10-04 23:20
 * @Version: 1.0.0.0
 */

public enum ColorEnum {

    /**红色*/
    RED("red","红色"),
    /**绿色*/
    GREEN("green","绿色"),
    /**蓝色*/
    BLUE("blue","蓝色");

    /**标识码*/
    private String code;
    /**描述*/
    private String desc;

    /**
     * 构造器
     * @param code
     * @param desc
     */
    ColorEnum(String code, String desc){
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
     * 通过标识码获取对象
     * @param code
     * @return
     */
    public static ColorEnum getInstanceByCode(String code){
        ColorEnum[] colorEnums = ColorEnum.values();
        for (ColorEnum colorEnum : colorEnums){
            if (colorEnum.getCode().equals(code)){
                return colorEnum;
            }
        }
        return null;
    }
}
