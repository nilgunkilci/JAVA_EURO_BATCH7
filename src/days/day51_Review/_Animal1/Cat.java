package days.day51_Review._Animal1;

import days.day51_Review._Animal1.Animal;

public class Cat extends Animal {
    public String breed;

    public Cat(String name, int age,String breed) {
        super(name, age);
        this.breed= breed;
    }
    public void meow() {
        System.out.println(name+ " is meowing");
    }
}
