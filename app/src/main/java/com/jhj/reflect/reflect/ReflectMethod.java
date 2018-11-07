package com.jhj.reflect.reflect;

import java.lang.reflect.Method;

public class ReflectMethod {


    /**
     * 获取全部的成员方法（包含私有的）
     *
     * @param clazz Class<?>
     */
    public static Method[] getDeclaredMethods(Class<?> clazz) {
        return clazz.getDeclaredMethods();

    }

    /**
     * 获取全部的公有的成员方法
     *
     * @param clazz Class<?>
     */
    public static Method[] getMethods(Class<?> clazz) {
        return clazz.getMethods();
    }

    /**
     * 获取某个的成员方法（包含私有的）
     *
     * @param clazz Class<?>
     */
    public static Method getDeclaredMethod(Class<?> clazz, String MethodName) {
        try {
            return clazz.getDeclaredMethod(MethodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取某个的公开的成员方法
     *
     * @param clazz Class<?>
     */
    public static Method getMethod(Class<?> clazz, String MethodName) {
        try {
            return clazz.getMethod(MethodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

}
