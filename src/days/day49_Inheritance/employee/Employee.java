package days.day49_Inheritance.employee;

public class Employee {
    String name;
    int employeeID;
    double salary;
    int workHours;
    int vacationDay;
    char gender;

    public void raiseSalary(){}

    public void leaHoliday(){
        System.out.println("Method created in parent Class");
        System.out.println(" You have booked 5 days holiday");
    }


    public void resign(){}

}
