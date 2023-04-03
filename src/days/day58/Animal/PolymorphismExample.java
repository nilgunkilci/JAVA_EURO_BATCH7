package days.day58.Animal;

public class PolymorphismExample {

    public static void main(String[] args) {


        // Non- polymorphism object creation //
        Animal a = new Animal();
        a.sound();

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Duck duck = new Duck();
        duck.sound();


        System.out.println("----------");


        // Polymorphic object creation //
        Animal dog1 = new Dog();
        dog1.sound();

        Animal cat1=new Cat();
        cat1.sound();

        Animal duck1 = new Duck();
        duck1.sound();

        // Sama object name , same methods, different behaviour / polymorphism
        Animal animal = new Animal();
        animal.sound();
        animal = new Dog();
        animal.sound();
        animal=new Cat();
        animal.sound();
        animal= new Duck();
        animal.sound();

    }
}
