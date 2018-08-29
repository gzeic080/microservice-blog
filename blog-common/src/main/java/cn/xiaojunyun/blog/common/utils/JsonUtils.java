package cn.xiaojunyun.blog.common.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO: 类描述
 *
 * @author junyunxiao
 * @date 2018-8-3 14:40
 */
public class JsonUtils {
    private static final Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    private static JsonParser jsonParser=new JsonParser();

    /**
     * 将Object转换成Json字符串
     * @param data
     * @return
     */
    public static String toJsonString(Object data){
        return data!=null?gson.toJson(data):"";
    }

    /**
     * 将字符串转换为指定的类
     * @param data
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T fromJSON(String data, Class<T> type) {
        return StringUtils.isNoneEmpty(data)&& type != null? gson.fromJson(data.replaceAll("[\n\r\t]", ""), type) : null;
    }

    /**
     * 将json字符串转换为List
     * @param data
     * @param type
     * @param <T>
     * @return
     */
    public static <T> List<T> toList(String data,Class<T> type ){
        return StringUtils.isNoneEmpty(data) && type!=null?(List<T>) gson.fromJson(data,new TypeToken<List<T>>(){}.getType()):null;

    }

    /**
     * 将json字符串转换为map
     * @param data
     * @param <T>
     * @param <V>
     * @return
     */
    public static <T,V>Map<T,V> toMap(String data){

        return StringUtils.isNoneEmpty(data)?(Map<T, V>) gson.fromJson(data,new TypeToken<Map<T,V>>(){}.getType()):null;
    }


   /* public static void main(String[] args) {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("name","张三");
        map.put("age",19);
        String s=JsonUtils.toJsonString(map);

        System.out.println(s);
        System.out.println(JsonUtils.toMap(s));
    }*/
}