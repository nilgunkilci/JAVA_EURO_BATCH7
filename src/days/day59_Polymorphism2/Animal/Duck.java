package days.day59_Polymorphism2.Animal;

public class Duck extends Animal implements CanSwim,CanFly{


    public Duck(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    public void move(){
        System.out.println(" I am Cat and I can walk. Rarely , Imay run");
    }
    public void eat(){
        System.out.println( "I am Duck and eating  corn ");
    }

    public void makeSound(){
        System.out.println( "I am a Dog and I can make sound  -Vak Vakkkk");
    }

    @Override
    public void swim() {
        System.out.println("I am Duck and I can swim" );
    }

    @Override
    public void fly() {
        System.out.println("I am Duck and I can fly");

    }
}
