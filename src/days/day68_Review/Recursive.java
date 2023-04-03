package days.day68_Review;

public class Recursive {
    public static void main(String[] args) {
        // Parametre olarak gonderilen sayiyi 1 e kadar olan dizi halinde
        // toplamini hesaplayan bir recursive method yaziniz

        System.out.println(addUp(4));

        System.out.println("recursive(6) = " + recursive(6));

    }
    public static int recursive (int sayi){

        int sum= 0;
        for (int i =sayi ;i>0; i--){
            sum += i;
        }
        return sum;
    }
    public static int addUp(int num){
        if(num == 1){
            return 1;
        }
        return num + addUp(num -1);
    }
}
