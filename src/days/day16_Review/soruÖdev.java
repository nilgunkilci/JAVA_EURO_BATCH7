package days.day16_Review;

public class soruÖdev {
    public static void main(String[] args) {

        //
        int ay = 2;
        int günsayisi = 0;

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                günsayisi = 31;
                break;

            case 2:
                günsayisi = 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                günsayisi = 30;
                break;

            default:
                System.out.println("Yanlis Giris");
        }
        System.out.println("günsayisi = " + günsayisi);
    }
}
