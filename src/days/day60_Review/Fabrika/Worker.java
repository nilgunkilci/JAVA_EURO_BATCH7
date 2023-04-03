package days.day60_Review.Fabrika;

public class Worker extends Person{

    private String department;

    public Worker(String name, int age, String department) {
        super(name, age);
        this.department= department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void work() {

        System.out.println(this.getName() + " günlük islerimi yapiyorum  " + this.getDepartment() + " bölümünde calisiyorum");
    }

    @Override
    public String showInfo() {
        return this.getName() + " -  " + this.getAge() + " yasindayim. " +  " ";
    }

    @Override
    public String toString() {
        return "Worker{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
