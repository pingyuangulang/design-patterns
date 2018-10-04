package com.china.cn.design_patterns.factory_design_pattern.entityenum;

import com.china.cn.design_patterns.factory_design_pattern.utils.OptionalUtils;

/**
 * @Description: 用来标识图像类型的枚举
 * @ClassName: EntityEnum
 * @Author: bin.ji
 * @Date: 2018-10-04 21:56
 * @Version: 1.0.0.0
 */

public enum EntityEnum {

    /**长方形类型*/
    RECTANGLE("rectangle","长方形"),
    /**正方形类型*/
    SQUARE("square","正方形"),
    /**圆形类型*/
    CIRCLE("circle","圆形");

    /**图形类型标识码*/
    private String code;
    /**图形描述*/
    private String desc;

    /**
     * 枚举类构造器
     * @param code
     * @param desc
     */
    EntityEnum(String code, String desc){
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
     * 根据标识码获取对应枚举对象
     * @param code
     * @return
     */
    public static EntityEnum getInstanceByCode(String code){
        if (OptionalUtils.isBlank(code)){
            return null;
        }
        EntityEnum result = null;
        EntityEnum[] entityEnums = EntityEnum.values();
        for (EntityEnum entityEnum : entityEnums){
            if (code.equals(entityEnum.getCode())){
                result = entityEnum;
                break;
            }
        }
        return result;
    }
}
