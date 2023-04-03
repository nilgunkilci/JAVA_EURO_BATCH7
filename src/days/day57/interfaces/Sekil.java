package days.day57.interfaces;

public interface Sekil {


    // Imterface variables herzaman 'public final static' dir. bundan dolayi yazmaya gerek yoktur
    //int MAX_SIZE=100;
    public static final int MAX_SIZE=100;
        //protected int MIN_SIZE=100; procted olmaz
    // interface class olmadigi icin constructor olusturulmaz.
   // public Sekil(){}


    // Interface methods are always abstract ve body leri yoktur
    public abstract void draw();


    // Interface methods are always public . oldugu icin public keyword yazmaya gerek yoktur.
    //public void draw();


    // can not have any other access modifier
   //  private void draw();
   // protected void draw();

    // Interface can not have final and abstract methods
   // final void draw3();
   // static void draw3();

    // Interface can have default method
    default void draw4(){}

    //public void draw4(){}
     //protected  void draw4(){}


    // buradann sonraki metodlar abstract metod degiller. yani bunlarin body si var.
    static void draw5(){
        System.out.println("dddd");

    }  // Bu metoda , interface ismi ile baska class dan cagrilabilir.


    // private methods , Interface icindeki baska bir method tarafindan cagrilabilir
    default void draw6(){
        draw7();
    }
    private void draw7(){
        System.out.println("DENEMe");
    }











}
