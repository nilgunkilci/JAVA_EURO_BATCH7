package days.day59_Polymorphism2.Animal;

public class Dog extends Animal implements CanSwim{


    public Dog(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    @Override
    public void move() {
        System.out.println(" I am dog and I can run");
    }

    @Override
    public void eat() {
        System.out.println( "I am eating  meat");
    }

    @Override
    public void makeSound() {
        System.out.println( "I am a Dog and I can make sound  -Hav... Havv");
    }

    @Override
    public void swim() {

    }
}
