package days.day59_Polymorphism2.Animal;

import java.security.spec.DSAGenParameterSpec;
import java.util.ArrayList;

public class Zoo {
    private String name;
    private String address;

    private ArrayList<Cat> cats;
    private ArrayList<Dog> dogs;
    private ArrayList<Duck>ducks;
    private ArrayList<Bird>birds;

    private ArrayList<Animal> animals; // Animal Class ini miras alan tüm hayvanlari bu ArrayListe ekleyebilirim.
    private ArrayList<CanFly>animalsCanFly;
    private ArrayList<CanSwim>animalsCanSwim;

    public Zoo(String name, String address ) {
        this.name = name;
        this.address = address;
    }
   /* public void addDog(Dog dog){
        this.dogs.add(dog);
    }
    public ArrayList<Dog>dogList(){
        return dogs;
    }
    public void printDogs(){
        for (Dog dog: dogs){
            System.out.println("dog = " + dog);
        }
    }

    */
    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }
    public ArrayList<Animal>animalList (){
        return animals;
    }
    public void printAnimals(){
        for (Animal animal : animals) {
            System.out.println("animal = " + animal);
        }
    }



}
