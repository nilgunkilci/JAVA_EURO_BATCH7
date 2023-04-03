package days.day42_Constructor2.student;

public class Student {
    int schoolNumber;
    String  name;
    String country;
    String city;


    // Constructor chaining , ic ice constructor olusturma
    public Student() {
        System.out.println(" Default constructor inkoved.");
    }

    public Student(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public Student(int schoolNumber, String name) {
          // constructor icinde baska bir constructor cagrilmasi ilk satirda gerceklesmek zorunda
        this(schoolNumber);
        //this.schoolNumber = schoolNumber;
        this.name = name;
    }

    public Student(int schoolNumber, String name, String country) {
       /* this.schoolNumber = schoolNumber;
        this.name = name;

        */
        this(schoolNumber, name);
        this.country = country;
    }

    public Student(int schoolNumber, String name, String country, String city) {
        /*this.schoolNumber = schoolNumber;
        this.name = name;
        this.country = country;

         */
        this(schoolNumber, name, country);
        this.city = city;

    }
    public String toString(){
        String str = " ";
        str += " Okul no           : " + this.schoolNumber + " \n";
        str += " Ogrencini adi     : " + this.name + " \n";
        str += " Ogrencini ulkesi  : " + this.country +"\n";
        str += " Ogrencini sehri   : " + this.city;
        return str;
    }

}
