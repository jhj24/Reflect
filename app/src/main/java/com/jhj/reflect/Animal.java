package com.jhj.reflect;

public class Animal {

    public String name;
    private int year;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    private Animal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void animalInfo(int year) {
        System.out.print("动物" + name + "今年" + year + "岁了");
    }


    public void animalName(int year) {
        System.out.print("动物 -->" + name);
    }
}
