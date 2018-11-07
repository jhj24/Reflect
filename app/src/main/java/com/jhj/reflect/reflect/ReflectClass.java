package com.jhj.reflect.reflect;

public class ReflectClass {


    // 获取Class的三种方式
    static Class<?> getClass(Class<?> clazz) {
        return clazz;
    }

    static Class<?> getClass(String clazz) {
        try {
            return Class.forName(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    static <T> Class<?> getClass(T a) {
        return a.getClass();
    }

}
