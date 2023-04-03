package days.day59_Polymorphism2.Animal;

public class AnimalTest {

    public static void main(String[] args) {

        // Animal animal = new Animal("Animal",12,"Yellow",10);
        // abstract class oldugundan instance olusturulamaz.

       //Cat cat = new Cat("Mahur", 4, "Dar gray", 5);
        //System.out.println("cat = " + cat);
        //cat.makeSound();
        //cat.move();
        //cat.eat();
        //cat.swim();


        //Dog dog = new Dog (" Karabas",4,"Black",14);
        //dog.makeSound();


        // Polymorphic variable ... Parent class tipinde class objesi referansi tutabilen degisken.
        Animal animal = new Cat("Mahur", 4, "Dar gray", 5);
        Animal animal1 = new Dog (" Karabas",4,"Black",14);

        animal.makeSound();
        animal1.makeSound();

        animal = new Bird("Cici kus",2,"Yellow",1);
        animal.makeSound();



    }
}
