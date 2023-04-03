package days.day23;

public class C8_AgeCalculator {

    public static void main(String[] args) {

        // Parametre olarak isim, su anki tarih ve dogum tarihini parametre olarak alip
        // kisinin yasini hesaplayan bir method yaziniz

        ageCalculator("mesut ", 2022, 2010);


    }

    public static void ageCalculator(String isim, int simdi, int dogum) {

        int yas = simdi - dogum;
        System.out.println(isim + yas + " yasindasiniz");


    }
}
