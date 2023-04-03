package days.day14;

public class Switch {
    public static void main(String[] args) {

        //haftanin günleri pzt 1. gün

        int gunSiraNo = 2;


        switch (gunSiraNo) {
            case 1:
                System.out.println("gunlerden Pazartesi");
                break;
            case 2:
                System.out.println("gunlerden Sali");
                break;
            case 3:
                System.out.println("gunlerden Carsamba");
                break;
            case 4:
                System.out.println("gunlerden Persembe");
                break;
            case 5:
                System.out.println("gunlerden Cuma");
                break;
            case 6:
                System.out.println("gunlerden Cumartesi");
                break;
            case 7:
                System.out.println("gunlerden Pazar");
            default:
                System.out.println("gecersiz sayi");

        }
        System.out.println("Swich disindayiz");
        gunSiraNo=7;
        switch (gunSiraNo) {
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("hafta ici");
                break;
            case 7:
            case 6:
                System.out.println("happy weekend");
                break;
            default:
                System.out.println("hicbiri");
        }
    }
}
