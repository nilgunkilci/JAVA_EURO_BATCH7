package days.day60_Review.Fabrika;

public class WorkerCanDrive extends Worker implements CanDrive{

    public WorkerCanDrive(String name, int age, String department) {
        super(name, age, department);
    }

    @Override
    public void drive() {
        System.out.println(" I can drive.");
    }
}
