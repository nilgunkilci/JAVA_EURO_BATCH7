package days.day66_Map;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

    public static void main(String[] args) {
        Map<Integer,Student> students = new HashMap<>();

        Student student1 = new Student("John Doe", 12345,95.5);
        Student student2 = new Student("Jane Doe", 54321, 70);
        Student student3 =new Student("Jim Smith", 23541, 55.5);

        students.put(student1.getId(), student1);
        students.put(student2.getId(), student2);
        students.put(student3.getId(), student3);

        System.out.println("Student with id 12345 : " + students.get(12345));
        System.out.println("Student with id 54321 : " + students.get(54321));
        System.out.println("Student with id 23541 : " + students.get(23541));

    }
}

class Student{

    public String name;
    public int id;
    public double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}