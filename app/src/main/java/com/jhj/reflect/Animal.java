package com.jhj.reflect;

public class Animal {

    public int year;
    public String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    private void animalInfo(int year) {
        System.out.print("动物" + name + "今年" + year + "岁了");
    }


    public void animalName(int year) {
        System.out.print("动物 -->" + name);
    }
}
