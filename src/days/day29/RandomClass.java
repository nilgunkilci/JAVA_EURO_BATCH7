package days.day29;
import java.util.Random;  // Random yerine * isareti koyarak tum hepsine ulasabiliriz

public class RandomClass {
    public static void main(String[] args) {
        Random rastgele = new Random();
        System.out.println("rastgele = " + (rastgele.nextInt()));

    }
}
