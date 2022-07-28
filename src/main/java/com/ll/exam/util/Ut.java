package com.ll.exam.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ll.exam.article.dto.ArticleDto;

public class Ut {
    static ObjectMapper om;

    static{
        om = new ObjectMapper(); //ObjectMapper 는 기본으로 쓰지 않고 아래와 같이 재정의해서 프로젝트에서 static 메소드로 사용한다.

    }
    public static class json {
        public static String toStr(Object obj, String defaultValue) {

            try {
                return om.writeValueAsString(obj);
            } catch (JsonProcessingException e) {
                return defaultValue;
            }
        }
        public static <T> T toObj (String jsonStr,  Class<T> cls, T defaultValue) {
            try{
                return (T) om.readValue(jsonStr,cls);
            } catch(JsonProcessingException e){
                return defaultValue;
            }
        }



    }
}