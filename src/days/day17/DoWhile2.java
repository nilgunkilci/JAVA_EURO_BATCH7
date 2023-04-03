package days.day17;

public class DoWhile2 {
    public static void main(String[] args) {

        int i=0;
        int i2=i+1;
        do{
            System.out.println("sum = "+(i+i2)); // 1, 3, 5
            i++; // 1, 2,
            i2++; // 2, 3,
        }while (i<50);
    }
}
