package days.day35_Arrays;

public class Arrays4 {
    public static void main(String[] args) {

        // verilen Array de A ismi ile baslayan elemanlari yazdiriniz.
        // .startsWith() methodunu kullaniyoruz
        String [] sehir= {"Istanbul", "Ankara","Mus", "Antalya", "Artvin"};
        String ist = sehir[0];
        for (String A:sehir){
             if ( A.startsWith("A")){
                 System.out.println(A);
             }
        }
    }
}
