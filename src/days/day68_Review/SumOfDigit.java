package days.day68_Review;

public class SumOfDigit {
    public static void main(String[] args) {


        // Bir String icerisindeki sadece rakamlari toplayan bir method yaziniz
        // 35sdg23AD567Ffa
        System.out.println(  sumOfDigits("35kl"));
        System.out.println("sumOfDigit(\"234rff\") = " + sumOfDigit("234rff"));
    }

  /*  public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i<str.length();i++){
            if (Integer.valueOf(str.charAt(i)) instanceof Integer){
                sum +=Integer.valueOf(str.charAt(i)).intValue();
            }
        }
        return sum;
    }*/
  public static int sumOfDigits(String str) {
      int toplam = 0;
      for (int i = 0; i < str.length(); i++) {
          if (Character.isDigit(str.charAt(i))) {
              toplam += Integer.parseInt(String.valueOf(str.charAt(i)));
          }
      }
      return toplam;
  }
    public static int sumOfDigit(String str){
        int total = 0;
        char[] ch = str.toCharArray();
        for(char each : ch){
            if(Character.isDigit(each)){
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }
}

