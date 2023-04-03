package days.day51_Review._Animal1;

public class AnimalTest {

    public static void main(String[] args) {

        Dog dog = new Dog(" Max",5,"Kangal");
        System.out.println("dog.name = " + dog.name);
        System.out.println("dog.age = " + dog.age);
        System.out.println("dog.breed = " + dog.breed);
        dog.move();
        dog.eat();
        dog.bark();

        Cat cat = new Cat(" Duman",3,"Tekir");

        System.out.println("cat.name = " + cat.name);
        System.out.println("cat.age = " + cat.age);
        System.out.println("cat.breed = " + cat.breed);
        cat.move();
        cat.eat();
        cat.meow();
        // cat.bark();

        Animal animal = new  Animal("Poyraz",10);
        System.out.println("animal.name = " + animal.name);
        System.out.println("animal.age = " + animal.age);
        // System.out.println(animal.breed);
        animal.move();
        animal.eat();
        // animal.meow();
       // animal.bark();
    }
}
