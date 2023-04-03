package days.day62;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileOps {

    public static void main(String[] args)   {

        File file = new File("src/days/day62/Data.txt");
        Scanner satirOku = null;

        try {
            satirOku = new Scanner(file);
            System.out.println("Dosyayi sistemde buldum");

            /* System.out.println(satirOku.nextLine());
            System.out.println(satirOku.nextLine());
            System.out.println(satirOku.nextLine());
            System.out.println(satirOku.nextLine());*/

            while (satirOku.hasNextLine()){
                System.out.println(satirOku.nextLine());
            }
            System.out.println(satirOku.nextLine()); // Olamayan bir satırı okumaya çalıştığımızdan "NoSuchElementException" hatası oluşur.
            System.out.println("Dosyayını bütün satırlarını hatasız okudum.");
        }

        catch (FileNotFoundException foundException){
            System.err.println("Dosya sistemde yok.");
        }
        catch (NoSuchElementException olmayanSatir){
            System.err.println("Dosyada olmayan bir satır okunmaya çalışılıyor.");
        }
        catch (Exception exp){
            exp.printStackTrace();
        }
        finally {
            System.out.println("Finally bloğundayım.");
            //satirOku = null;
            //satirOku.close();
        }

    }
}
