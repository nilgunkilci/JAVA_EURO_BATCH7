package days.day49_Inheritance.grandParent;

public class Parent extends GrandParent {

    String lastName;
      public Parent( String name,String lastName){
          super (name);  // super key word her zaman ilk satirda cagrilmalidir
          this.lastName= lastName;
      }
      public void display(){
          super.display();
          System.out.println("Last name of parent is: " +lastName);
      }
}
