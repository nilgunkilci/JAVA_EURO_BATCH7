package days.day56_Abstraction.Sekil;

public abstract class Sekil {  // class önüne abstract keyword yazarak yapiliyor.
    public  Sekil(){}  // bu constructor i yazmasak da default olarak java olusturuyor
    //  cünkü cihld classlarin constructor indan once parentclasisin constructoru calisir.

    public  abstract void ciz(); // Abstract metodlarda body yoktur.
    //public  abstract void ciz(int a, int b, int c);

    // abstract class ta instance (abstract olmayan) method da create edilebilir.
    // Fakat obje olusturulmadigi icin bu metodu sadece sub classlar kullanir.
    public void  cizme(){
        System.out.println("Sekil cizme");
    }


    public final  void sinirlariCiz(){
        System.out.println(" Sinirlari ciziyor.");
    }

    public static  void kaydir(){
        System.out.println(" cigi kaydiriliyor");
    }
}
