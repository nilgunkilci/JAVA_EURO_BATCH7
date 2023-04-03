package days.day18;

public class AsalSAyi {
    public static void main(String[] args) {
        int num=8;
        int sayac=0;
        for (int i=2; i<num;i++){
            if (num%i==0){
                sayac++;
                break;

            }i++;

            }if ((sayac==0)){
            System.out.println(num +" sayisi asal degildir");
        }else{
            System.out.println(num +" sayisi asal sayidir");
        }
    }
}
