package days.day52.paketB;

public class AccessModifiers {
    private int id;
    protected long TCNo;
    public String name;
    int okulNo;


    private void  privateToplama ( int sayiA, int sayiB){
        System.out.println(" toplam = " + sayiA+sayiB);
    }

    void defaultMethod (){
        System.out.println(" I am, a defaulu method");
    }
    protected  void protectedMethod(){
        System.out.println(" I am a prptected");
    }
    public void publicMtehod (){
        System.out.println("I am a Public method");
    }

    public static void main(String[] args) {

        System.out.println(" Access modifiers in Java ");
        AccessModifiers accessModifiers = new AccessModifiers();

        accessModifiers.id= 10; // Private tanimlamaya ragme ayni class icinden erisilebilir.
        accessModifiers.name= " EuroStudy";  //Public tanimlandigin en genis görünürlüge sahip ve her class tan erisilebilir.
        accessModifiers.okulNo= 1234; // Default tanimlandigi icin ayni class ve ayni package icerisinden erisilebilir
        accessModifiers.TCNo= 12345678911L; // Protected tanimlanmai ile belirlendigi icin ayni cla, ayni paket veya farkli paket

        accessModifiers.privateToplama(23,2);
        accessModifiers.defaultMethod();
        accessModifiers.protectedMethod();
        accessModifiers.publicMtehod();
    }

}
