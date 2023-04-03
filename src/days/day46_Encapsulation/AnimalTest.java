package days.day46_Encapsulation;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal= new Animal("Kedi",3);
        System.out.println(animal.getSpecies());
        System.out.println(animal.getAge());

        Animal animal1=new Animal("§$%&",-3);
        System.out.println(animal1.getSpecies());
        System.out.println(animal1.getAge());

        animal.haveBirthday();
        System.out.println(animal.getAge());
    }
}
