package com.aqiu.pattern.factory.before;

public abstract class Coffee {
    abstract String getName();

    public void addMilk(){
        System.out.println("add milk");
    }

    public void addSugar(){
        System.out.println("add sugar");
    }
}
