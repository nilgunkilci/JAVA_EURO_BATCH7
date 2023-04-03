package days.day47;

public class Job {

    private String title;
    private String company;
    private double salary;

    public Job(){
        System.out.println("No-arg constructor");
        this.title = "undefined";
        this.company = "undefined";
    }

    public Job(String title){
        System.out.println("One-arg constructor");
        this.title = title;
        this.company = "undefined";
    }

    public Job(String title, String company, double salary){
        System.out.println("Three-args constructor");
        setTitle(title);
        setCompany(company);
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        // condition
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        // condition
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }

}
