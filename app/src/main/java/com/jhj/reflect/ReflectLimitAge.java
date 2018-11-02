package com.jhj.reflect;

import android.util.Log;

import java.lang.reflect.Method;

public class ReflectLimitAge {

    public static void a(Class<?> cls) {
        Method[] methods = cls.getDeclaredMethods();
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
