package days.day15;

public class MutlakDeger {
    public static void main(String[] args) {

        // Bir sayinin mutlak degerini ternary operator
        // kullanarak bulan bir program yaziniz

        int x=-24;
        int mutlakDegerx= (x>0)?x:-x;
        System.out.println("mutlakDeger x = " + mutlakDegerx);
    }
}
