package days.day48_Review_Static_Encapsulation;

public class StudentTest {
    public static void main(String[] args) {
        Student ogr1= new Student( "Ali",30,"Computer Science");
        Student ogr2= new Student( "Ali",3,"Computer Science");

        ogr1.toString();
       /* String result = ogr1.toString();
        System.out.println("result = " + result);
        */
        System.out.println(ogr1);
       // ogr1.isimDüzenle("mehmet");
        System.out.println(ogr2);
       // System.out.println("ogr1.isimGöster() = " + ogr1.isimGöster());
        ogr2.setName("   ALI  ");

        System.out.println("ogr1.equals(ogr2) = " + ogr1.getName().equals(ogr2.getName()));

        String str= "23dfg";
        System.out.println("Character.isAlphabetic(str.charAt(0)) = " + Character.isAlphabetic(str.charAt(0)));
    }
}
