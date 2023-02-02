package org.example;

public class Empleado {

    //Attributes
    String name;

    //Constructor

    public Empleado() {
    }


    //Special Methods


    public String greet(String name) {
        String greeting = "Hola " + name;

        return greeting;
    }

    public int add(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;

        return result;
    }
}
