package com.jhj.reflect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ReflectLimitAge.a(MainActivity.class);
        a();

        /*try {
            Class<?> clazz = Class.forName("com.jhj.reflect.Animal");
            Animal animal = (Animal) clazz.newInstance();
            Method method = clazz.getDeclaredMethod("info", int.class);
            Object a = method.invoke(animal, 1);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/


    }

    @LimitAge
    public void a() {

    }
}
