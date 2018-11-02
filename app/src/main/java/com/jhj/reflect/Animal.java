package com.jhj.reflect;

import android.util.Log;

public class Animal {

    public int year;
    public String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    private void info(int year) {
        System.out.print("动物" + name + "今年" + year + "岁了");
    }
}
