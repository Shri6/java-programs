package com.company;

//constructur is created in ConstructorPractice.java

public class carTest {
    public static void main(String[] args) {
        constructorPractice car = new constructorPractice("Toyota"); // is we won't created constructor it was empty
        constructorPractice car2 = new constructorPractice("Ferrari");
        //we defined String there so it is asking String.
        car.start();
        car2.start();
        car2.stop();
        car.start();
        constructorPractice car3 = new constructorPractice("Mahindra","300",80);
        System.out.println(car3); // automatically returns the toString function
    }

}
