package days.day3;

public class EscapeSequence {

    public static void main(String[] args) {

        System.out.println("Ahmet\tYilmaz");
        //   \t tap tusu arada bosluk olusturur.

        System.out.println("Merhaba\nNasilsin");
        //  \n  alt satira indirir.

        System.out.println("    *\n   * *\n  *   *\n *     *\n*********");

        System.out.println("Sampiyon \"Besiktas\" ");
        //  \"  cift tirnak yazimini saglar.

        System.out.println(" Sen\\Ben\\Biz\\O\\Onlar");
        //  \\, tek slasch \ olusturur.

        System.out.println("önceki karakteri\b siler");
        //  \b back space kendinden önceki karakteri siler.
        System.out.println("önceki karakteri \b siler");

        System.out.println("önceki metni\r siler");
        //  \r kendinden önceki tüm metni siler.

        System.out.println("Ali\'nin arabasi\f");
        // \' tek tirnak yazilmasini saglar.

    }
}
