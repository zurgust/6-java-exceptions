package com.example.task01;

import java.sql.SQLOutput;

public class Task01Main {
    public static void main(String[] args) {
        try{
            codeWithNPE();
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    static void codeWithNPE() {
        String s = null;
        System.out.println(s.length()); //Попытка вызвать метод у неинициализированного объекта

        Person person = null;
        System.out.println(person.name);

        int[] numbers = null;
        System.out.println(numbers[0]);
    }
}

class Person {
    String name;
}