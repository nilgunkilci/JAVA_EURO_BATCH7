package days.day42_Constructor2.otoPark;

public class Car {
    String  marka;
    String  plaka;

    public Car(String marka, String plaka) {
        this.marka = marka;
        this.plaka = plaka;
    }

    @Override
    public String toString() {
        return   marka + "--"+  plaka  ;
    }
}
