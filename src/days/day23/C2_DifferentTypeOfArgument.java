package days.day23;

public class C2_DifferentTypeOfArgument {
    public static void main(String[] args) {
        displayName("Ayse");

        String name2 = "Ahmet";
        displayName(name2);

        agacaCikabilirmi(true);

        boolean sagliklimi = false;
        agacaCikabilirmi(sagliklimi);

    }

    public static void displayName(String name){
        System.out.println("My name is : " + name);
    }

    public static void agacaCikabilirmi(boolean b) {
        if (b) {
            System.out.println("Evet saglikli agaca cikabilir");
        } else {
            System.out.println("Hayir sagliksiz agaca cikamaz");
        }
    }
}
