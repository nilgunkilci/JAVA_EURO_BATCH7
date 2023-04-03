package days.day67_Review.Person;

public class Person {

    public String name;
    public String address;
    public int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void walk() {
        System.out.println("Person is walking");
    }

    public void printPersonInfo() {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("age = " + age);

    }
}


