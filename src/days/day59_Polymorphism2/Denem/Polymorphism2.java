package days.day59_Polymorphism2.Denem;

public class Polymorphism2 {
  public static void main(String[]args){

      System.out.println( "Polymorphism-2 in Java ");
      //Anonymous class definition and inner class implemantaion of abstract class
      Deneme deneme = new Deneme() {
          @Override
          void print() {
              System.out.println("Anonymous class..... inner class");
          }
      };
      deneme.print();
      //Anonymous class olduğundan getSimpleName() metodu herhangi bir isim döndürmez.
      System.out.println("deneme.getClass().getSimpleName() = " + deneme.getClass().getSimpleName());
      System.out.println("deneme.getClass().getName() = " + deneme.getClass().getName());

      //////////////////////////////////

      DenemeInherit denemeInherit = new DenemeInherit();
      denemeInherit.print();
      System.out.println("denemeInherit.getClass().getSimpleName() = " + denemeInherit.getClass().getSimpleName());
      System.out.println("denemeInherit.getClass().getName() = " + denemeInherit.getClass().getName());
  }

}
