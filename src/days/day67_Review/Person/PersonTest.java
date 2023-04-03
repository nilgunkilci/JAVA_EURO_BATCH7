package days.day67_Review.Person;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person("john", "2 London Road", 35);
        System.out.println(person.name);
        person.walk();
        person.printPersonInfo();

        Employee employee = new Employee("Jane", "5 Oxford Road", 30,1234,50000);
        System.out.println(employee.name);
        employee.walk();
        employee.printPersonInfo();

    }
}
