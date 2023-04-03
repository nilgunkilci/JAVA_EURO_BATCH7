package days.day46_Encapsulation;

public class PersonTest {
    public static void main(String[] args) {


        Person person = new Person();
         //person.name= "Mehmet";
         //person.age= 40;
        person.setName("Mehmet");
        System.out.println(person.getName());

        person.setAge(40);
        System.out.println("person.getAge() = " + person.getAge());



        Person person2= new Person();
        // person2.name= " *%6#*+Ahnmet§$&/*'";
        // person2.age=-25;

        person2.setName(" *%6#*+Ahnmet§$&/*'");
        System.out.println("person2.getName() = " + person2.getName());

        person2.setAge(-25);
        System.out.println("person2.getAge() = " + person2.getAge()); // sonuc 0 doner. cunku setter method da condition var

        Person person3=new Person("*%6#*+Ahnmet§$&/*'", -25);
        person3.print();

    }
}
