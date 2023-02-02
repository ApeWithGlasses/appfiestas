package org.example;

public class Main {
    public static void main(String[] args) {

        Empleado objectTypeEmployee = new Empleado();

        //Access to employees methods class:
        int result = objectTypeEmployee.add(2,3);
        System.out.println(result);

        //System.out.println(objectTypeEmployee.greet("Harry"));


    }
}