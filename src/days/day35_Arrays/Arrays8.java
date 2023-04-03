package days.day35_Arrays;

public class Arrays8 {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 5, 6, 9, 8};
        sayilar[0] = 500;
        System.out.println("sayilar[0] = " + sayilar[0]);//ilk elementi verir
        System.out.println("sayilar[sayilar.length-1] = " + sayilar[sayilar.length - 1]);//son elementi verir
        for (int n : sayilar) {
            System.out.println("n = " + n);
        }
        String[] sehirler = new String[]{"adiyaman", "Oslo", "Berlin", "Urfa"};
        print("Merhaba");
        print(sehirler);

    }

    public static void print(String str) {
        System.out.println("str = " + str);
    }

    public static void print(String[] kelimeler) {
        for (String kelime : kelimeler) {
            System.out.println("kelime = " + kelime);
        }
    }
}
