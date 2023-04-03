package days.day33_StringClass_Methodlari;

public class HelloName {
    public static void main(String[] args) {
        helloName(" Nilgun");
    }

    public static String helloName(String name){
        String hello="hello";
        System.out.println("hello.concat(name) = " + hello.concat(name));
        return name;

    }
}
