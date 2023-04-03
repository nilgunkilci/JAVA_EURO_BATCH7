package days.day59_Polymorphism2.Animal;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String color;
    protected int weight;

    public Animal(String name, int age, String color, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    abstract void move() ;

    abstract void eat() ;

    abstract void makeSound() ;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

