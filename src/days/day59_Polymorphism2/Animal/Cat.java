package days.day59_Polymorphism2.Animal;

public class Cat extends Animal implements CanSwim{


    public Cat(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    public void move(){
        System.out.println(" I am Cat and I can run");
    }
    public void eat(){
        System.out.println( "I am eating  meat. And sometimes I may eat for special purpose");
    }
    public void makeSound(){
        System.out.println( "I am a Dog and I can make sound  -Miyavvvvv");
    }

    @Override
    public void swim() {
        System.out.println(" I am Cat and I can swim");
    }
}
