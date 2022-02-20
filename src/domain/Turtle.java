package domain;

public class Turtle  extends Reptile {

    private String kind;

    public Turtle (String name, int age, int weight, String kind) {
         this.name=name;
        this.weight=weight;
        this.age=age;
        this.kind=kind; 
    }

    public Turtle () {
         this("Emma",1,4,"Caretta");
    }
    public Turtle(String name) {
        this(name,1,4,"BCaretta");
    }

    public void play() {
         System.out.println("Animal is playing...");
    }

    public void swim() {
        System.out.println("Animal is swimming...");
    }

    @Override
    public void hibernate() {
        System.out.println("Animal is hibernating...");
    }

    @Override
    public void sleep() {
       System.out.println("Animal is sleeping on the stone...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nkind:\t"+this.kind+"\n\nThis is turtle!";
    }

    @Override
    public void speak() {
            System.out.println("ua");
    }

    @Override
    public void eat() {
        System.out.println("Turtle eats fish!");
    }
 
}



