package domain;

public class Animal {

    protected String name;

    protected int age;

    protected int weight;

    public Animal() {
         name = "generic animal"; 
        weight = 1; 
        age = 4;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void speak() {
        System.out.println("Animal is speaking...");  
    }

    @Override
    public String toString() {
        return "Animal:" + "\name:\t" + name + "\nweight:\t=" + weight + "\nage:\t" + age;
    }

    public void sleep() {
         System.out.println("Animal is sleeping...");
    }
}
