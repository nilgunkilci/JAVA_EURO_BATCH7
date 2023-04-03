package days.day26;

public class C5_Cake {

    String bakery ;
    int slices=5;
    boolean isChoclate;
    static int cakeSlice=20;

    public void eat(){
        slices--;
        System.out.println(bakery + "  's cake slice : " + slices);
        cakeSlice--;
        System.out.println("Cake Slices : " + cakeSlice);
    }
}
