package days.day42_Constructor2.student;

public class StudentTest {

    public static void main(String[] args) {
        Student ogrenci1 = new Student(12345);
        System.out.println("ogrenci1 = " + ogrenci1);

        System.out.println("................................");

        Student ogrenci2 = new Student(1234,"Ali");
        System.out.println("ogrenci2 = " + ogrenci2);

        System.out.println("................................");

        Student ogrenci3 = new Student(123,"Ayse"," Turkey");
        System.out.println("ogrenci3 = " + "\n"+ogrenci3);

        System.out.println("................................");

        Student ogrenci4= new Student(1234, "Omer", "Deutschland", "KL");
    }
}
