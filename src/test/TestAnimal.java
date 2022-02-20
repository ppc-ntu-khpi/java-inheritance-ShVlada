package test;

import domain.Turtle;

public class TestAnimal {

    public static void main(String[] args) {
        Turtle turtle = new Turtle("Emma");
          System.out.println("Turle");
          turtle.hibernate();
          turtle.eat();
          turtle.speak();
          turtle.play();
          turtle.sleep();
    }
}
