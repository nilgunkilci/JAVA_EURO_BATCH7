package days.day14;

public class Aylar {
    public static void main(String[] args) {

        int aysiraNo = 5;
        String ayAdi = "";

        switch (aysiraNo) {
            case 1:
                ayAdi = "Ocak";
                break;
            case 2:
                ayAdi = " Subat ";
                break;
            case 3:
                ayAdi = " Mart ";
                break;
            case 4:
                ayAdi=" Nisan ";
                break;
            case 5:
               ayAdi=" Mayis ";
                break;
            case 6:
                ayAdi=" Haziran ";
                break;
            case 7:
               ayAdi=" Temmuz ";
                break;
            case 8:
                ayAdi=" Agustos ";
                break;
            case 9:
                ayAdi=" Eylül ";
                break;
            case 10:
                ayAdi=" Ekim";
                break;
            case 11:
                ayAdi=" Kasim ";
                break;
            case 12:
               ayAdi=" Aralik  ";

            default:
                System.out.println("yanlis giris yaptiniz");
        }
        ayAdi="Mart";
        String mevsim = "";
        switch (ayAdi){
            case "Aralik":
            case "Ocak":
            case "Subat":
                mevsim="Kis";
                break;
            case "Mart":
            case "Nisan":
            case "Mayis":
                mevsim="Bahar";
                break;
            case "Haziran":
            case "Temmuz":
            case "Agustos":
                mevsim="Yaz";
                break;
            case "Eylül":
            case "Ekim":
            case"Kasim":
                mevsim="Sonbahar";
                break;
            default:
                System.out.println("Mevsim bulunamiyorrr");

        }System.out.println("mevsim = " + mevsim);
    }
}
