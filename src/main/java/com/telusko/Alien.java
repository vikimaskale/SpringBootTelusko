package com.telusko;

public class Alien {
    private int age;
    private Laptop lap;

    Alien(){
        System.out.println("Alien object Created");
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        System.out.println("laptop setter called");
        this.lap = lap;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age setter called");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding...");
        lap.compile();
    }
}
