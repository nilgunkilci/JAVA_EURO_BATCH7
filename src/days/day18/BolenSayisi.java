package days.day18;

public class BolenSayisi {
    public static void main(String[] args) {
        int sayac=0;
        for(int i=2;i<22 ;i++){
            if (i%7==1){
                sayac++;
            }

        }
        System.out.println("sayac = " + sayac);
    }
}
