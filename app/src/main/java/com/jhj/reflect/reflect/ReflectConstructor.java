package com.jhj.reflect.reflect;

import java.lang.reflect.Constructor;

public class ReflectConstructor {

    /**
     * 获取全部的构造函数（包含私有的）
     *
     * @param clazz Class<?>
     */
    public static Constructor<?>[] getDeclaredConstructors(Class<?> clazz) {
        return clazz.getDeclaredConstructors();

    }

    /**
     * 获取全部的公有的构造函数
     *
     * @param clazz Class<?>
     */
    public static Constructor<?>[] getConstructors(Class<?> clazz) {
        return clazz.getConstructors();
    }

    /**
     * 获取某个的构造函数（包含私有的）
     *
     * @param clazz Class<?>
     */
    public static Constructor<?> getDeclaredConstructor(Class<?> clazz, Class<?>... parameterTypes) {
        try {
            return clazz.getConstructor(parameterTypes);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 获取某个的公开的构造函数
     *
     * @param clazz Class<?>
     */
    public static Constructor<?> getConstructor(Class<?> clazz, Class<?>... parameterTypes) {
        try {
            return clazz.getConstructor(parameterTypes);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

}
