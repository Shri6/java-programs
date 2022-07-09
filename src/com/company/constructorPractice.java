package com.company;

public class constructorPractice {
    private int year;
    private String model;
    private String speed;

    //constructors

    public constructorPractice(String model){ // consider car as the class name
        this.model = model;
    }

    public constructorPractice(String model, String speed, int year){ //two constructors are created
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    //methods

    public void start(){
        System.out.println("Started vehicle : "+this.model);
    }
    public void stop(){
        System.out.println("stopped car : "+this.model);
    }
    public String toString(){
        return "model : "+this.model+" speed : "+this.speed+" year : "+this.year;
    }
}
