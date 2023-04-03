package days.GrupArbeit;

public class yarisma4 {
    public static void main(String[] args) {

       /* create method that accepts one integer array and one integer number
       and returns the frequency of the number
        Ex:
        int[] array ={1,1,1,1,1,2,2};
        frequency(array, 1) ==> 5*/

        int[] numbers={1,3,56,32,45,76,32,77,32};
        int num=32;
        System.out.println(frequency(numbers, num));
    }
    public  static int frequency (int[] sayilar,int sayi){
        int count=0;
        for (int i : sayilar) {
            if (i == sayi) {
                count++;
            }
        }
        return count;

    }
}
