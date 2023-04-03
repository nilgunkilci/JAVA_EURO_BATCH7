package days.day49_Inheritance.employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee empolyee1 = new Employee();
        empolyee1.name = "Ahmet";
        empolyee1.employeeID = 12345;
        System.out.println(empolyee1.name);
        System.out.println(empolyee1.employeeID);

        Developer dev1 = new Developer();
        dev1.name = "Ayse";
        dev1.employeeID = 1234;
        dev1.projectName = "Chip";
        System.out.println(dev1.name);
        System.out.println(dev1.employeeID);
        System.out.println(dev1.projectName);

        Lawyer law1 = new Lawyer();
        law1.name= " Mehmet";
        law1.caseStatus= "Open";
        System.out.println(law1.name);
        System.out.println(law1.caseStatus);

        Secretary sec1= new Secretary();
        sec1.name= "Fatma";
        sec1.offoceName= "Accountant";
        System.out.println(sec1.name);
        System.out.println(sec1.offoceName);

        sec1.leaHoliday();
        sec1.giveReport();

    }
}
