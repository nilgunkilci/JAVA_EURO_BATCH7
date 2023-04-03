package days.day59_Polymorphism2.Animal;

public class Bird  extends Animal implements CanFly{


    public Bird(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    @Override
    public void move() {
        System.out.println(" I am Cat and I can walk. Rarely , Imay run");
    }

    @Override
    public void eat() {
        System.out.println( "I am Duck and eating  corn ");
    }

    @Override
    public void makeSound() {
        System.out.println("I am Bird. I make cik cikkkkkk");
    }


    @Override
    public void fly() {

    }
}
