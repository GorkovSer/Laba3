package com.company;


public class Main {

    public static void main(String[] args)
    {
        Poodle a = new Poodle();
        Pug b = new Pug();

        a.setInfo("smale","average", "Poodle", "Random text");
        b.setInfo("smale","smale", "Pug", "Random text");

        System.out.println(a.toString() + "\n\n" + b.toString());


    }
}
