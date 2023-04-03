package days.Method;

public class C7_Islemler {
    public static void main(String[] args) {

        // 2 int parametreli
        // Toplama,carpma, cikarma, bölme, modulus

        toplama(3, 5);
        carpma(40, 50);
        cikarma(50, 30);
        bölme(20, 5);
        modulus(30, 5);
        islem(2, 5, '+');
        islem(60,3,'/');
        islem(22,44,'*');
        islem(245,5,'%');
    }
    public static void islem(int a,int b,String operator){
        switch (operator){
            case "Carp":
                carpma(a,b);
                break;
            case "Böl":
                bölme(a,b);
                break;
            case "topla" :
                bölme(a,b);
                break;
            case "Cikar":
                cikarma(a,b);
                break;
            case "mod":
                modulus(a,b);

            default:
                System.out.println("tanimsiz");

        }
    }

    public static void toplama(int a, int b) {
        System.out.println("toplama = " + (a + b));
    }

    public static void carpma(int a, int b) {
        System.out.println("carpma = " + (a * b));
    }

    public static void cikarma(int a, int b) {
        System.out.println("cikarma = " + (a - b));
    }

    public static void bölme(int a, int b) {
        System.out.println("bölme = " + (a / b));
    }

    public static void modulus(int a, int b) {
        System.out.println("modulus = " + (a % b));
    }

    public static void islem(int a, int b, char islem) {
        switch (islem) {
            case '*':
                carpma(a, b);
                break;
            case '+':
                toplama(a, b);
                break;
            case '/':
                bölme(a, b);
                break;
            case '-':
                cikarma(a, b);
                break;
            default:
                System.out.println("tanimsiz islem");
        }
    }
        public static int islem2 ( int a, int b, char islem){
            switch (islem) {
                case '*':

                    return a*b;
                case '+':

                    return a+b;
                case '/':

                    return a/b;
                case '-':

                    return a-b;
                default:
                    System.out.println("tanimsiz islem");

            }
       return 0;
    }
    }
