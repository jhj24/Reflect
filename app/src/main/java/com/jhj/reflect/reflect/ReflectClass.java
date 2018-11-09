package com.jhj.reflect.reflect;

public class ReflectClass {


    // 获取Class的三种方式
    public static Class<?> getClass(Class<?> clazz) {
        return clazz;
    }

    public static Class<?> getClass(String clazz) {
        try {
            return Class.forName(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static <T> Class<?> getClass(T a) {
        return a.getClass();
    }


    //=================================================

    public static Object getInstance(Class<?> clazz) {
        try {
            return getClass(clazz).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

}
