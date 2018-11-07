package com.jhj.reflect.reflect;

import java.lang.annotation.Annotation;


public class ReflectAnnotation {

    /**
     * 获取全部的注解（包含私有的）
     *
     * @param clazz Class<?>
     */
    public static Annotation[] getDeclaredAnnotations(Class<?> clazz) {
        return clazz.getDeclaredAnnotations();

    }

    /**
     * 获取全部的公有的注解
     *
     * @param clazz Class<?>
     */
    public static Annotation[] getAnnotations(Class<?> clazz) {
        return clazz.getAnnotations();
    }

    /**
     * 获取某个的注解（包含私有的）
     *
     * @param clazz Class<?>
     */
    public static Annotation getAnnotation(Class<?> clazz, Class annotationClass) {
        return clazz.getAnnotation(annotationClass);
    }


}
