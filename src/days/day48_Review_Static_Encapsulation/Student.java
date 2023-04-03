package days.day48_Review_Static_Encapsulation;

public class Student {

    private String name;
    private int age;
    private int schoolNumber;
    private String division;

    public Student(String name, int age, String division) {
        //  this.name = name;
        setName(name);
        // this.age=age;
        setAge(age);
        // this.division = division;
        setDivision(division);
    }
   /*  public void isimDüzenle(String name){ // it is a kind of a setter method
        this.name= name.toUpperCase();
    }
    public String isimGöster(){ // it is a kind of agetter method
        return this.name;
    } */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase().trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 60) {
            this.age = age;
        } else {
            System.out.println(" Ogrenci yasi kurallara uygun degil. 18 - 60 yas araliginda olmali");
            this.age=18;
        }

    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolNumber=" + schoolNumber +
                ", division='" + division + '\'' +
                '}';
    }
}
