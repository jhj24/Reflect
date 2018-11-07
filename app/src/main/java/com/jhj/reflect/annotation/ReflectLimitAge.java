package com.jhj.reflect.annotation;

import android.util.Log;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class ReflectLimitAge {

    public static void a(Class<?> cls) {
        Method[] methods = cls.getDeclaredMethods();
        Class<?> v = cls.getSuperclass();
        Type b = cls.getGenericSuperclass();

        Log.w("xxx", cls.getName());
        if (methods.length > 0) {
            for (Method method : methods) {
                LimitAge annotation = method.getAnnotation(LimitAge.class);
                if (annotation != null) {
                    Class<?>[] a = method.getParameterTypes();
                    int minAge = annotation.minAge();
                    int maxAge = annotation.maxAge();
                }
            }
        }
    }
}
