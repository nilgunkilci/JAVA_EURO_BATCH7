package days.day51_Review._Animal1;

import days.day51_Review._Animal1.Animal;

public class Dog  extends Animal {
    public String breed;


    public Dog(String name, int age,String breed) {
        super(name, age);
        this.breed= breed;

    }
    public void bark(){
        System.out.println(name + " is barking");
    }
}
