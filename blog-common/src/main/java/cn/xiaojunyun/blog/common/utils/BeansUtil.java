package cn.xiaojunyun.blog.common.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO: JavaBen工具类
 *
 * @author junyunxiao
 * @date 2018-7-16 14:34
 */
public class BeansUtil{

    public static Map<String,Object> voToMap(Object object)throws Exception{
        if (object==null){return null;}
        Map<String,Object> resultMap=new HashMap<String, Object>();
        BeanInfo beanInfo =Introspector.getBeanInfo(object.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            String key = property.getName();
            // 过滤class属性
            if (!"class".equals(key)) {
                // 得到property对应的getter方法
                Method getter = property.getReadMethod();
                Object value = getter.invoke(object);

                resultMap.put(key, value);
            }

        }
        return resultMap;
    }
}
