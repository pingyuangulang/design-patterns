package com.china.cn.design_patterns.factory_design_pattern.utils;

import org.apache.commons.lang.StringUtils;

/**
 * @Description: 判断对象是否为空的工具类
 * @ClassName: OptionalUtils
 * @Author: bin.ji
 * @Date: 2018-10-04 22:22
 * @Version: 1.0.0.0
 */

public class OptionalUtils {

    /**
     * true：对象为空；false：对象不为空
     * @param object
     * @return
     */
    public static final boolean isNull(Object object){
        if (null == object){
            return true;
        }
        return false;
    }

    /**
     * false：对象为空；true：对象不为空
     * @param object
     * @return
     */
    public static final boolean isNotNull(Object object){
        return !isNull(object);
    }

    /**
     * 判断字符串对象为空或为空串或为空白字符
     * @param str
     * @return
     */
    public static final boolean isBlank(String str){
        return StringUtils.isBlank(str);
    }
}
