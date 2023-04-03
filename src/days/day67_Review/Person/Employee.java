package days.day67_Review.Person;

public class Employee  extends Person{


    public double salary;
    public int employeeId;


    public Employee(String name, String address, int age, int employeeId, double salary) {
        super(name, address, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void printPersonInfo(){
        super.printPersonInfo();
        System.out.println("employeeId = " + employeeId);
        System.out.println("salary = " + salary);
    }


}
