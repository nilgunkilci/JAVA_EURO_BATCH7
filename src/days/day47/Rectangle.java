package days.day47;

public class Rectangle {

    // Encapsulation prensiplerini kullanarak
    // length ve breadth adinda iki adet instance olusturun
    // Her iki degiskene deger assign eden constructor olusturun
    // Getter ve Setter methodlari olusturun
    // Test class olusturun
    // Parametre alan constructor uzerinden object olusturun
    // gettter method ile degerleri gosterin
    // Rectangle alanini hesaplayan bir method olusturun
    // Rectangle in alanini hesaplayin
    // Setter method ile her iki degeri degistirin
    // Degismis degerleri gosterin
    // Yeni degerlerle yeniden Rectangle alanini hesaplayin

     private int length;
    private int breatdth;

    public Rectangle(int length, int breatdth) {
        this.length = length;
        this.breatdth = breatdth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreatdth() {
        return breatdth;
    }

    public void setBreatdth(int breatdth) {
        this.breatdth = breatdth;
    }

    public Rectangle setChange (Rectangle rectangle){
        int tep= getLength();
        length= getBreatdth();
        breatdth=tep;

        return rectangle;
    }
}
