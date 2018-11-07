package com.jhj.reflect.reflect;

import java.lang.reflect.Field;

public class ReflectField {

    /**
     * 获取全部的成员变量（包含私有的）
     *
     * @param clazz Class<?>
     */
    public static Field[] getDeclaredFields(Class<?> clazz) {
        return clazz.getDeclaredFields();

    }

    /**
     * 获取全部的公有的成员变量
     *
     * @param clazz Class<?>
     */
    public static Field[] getFields(Class<?> clazz) {
        return clazz.getFields();
    }

    /**
     * 获取某个的成员变量（包含私有的）
     *
     * @param clazz Class<?>
     */
    public static Field getDeclaredField(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取某个的公开的成员变量
     *
     * @param clazz Class<?>
     */
    public static Field getField(Class<?> clazz, String fieldName) {
        try {
            return clazz.getField(fieldName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }
}
