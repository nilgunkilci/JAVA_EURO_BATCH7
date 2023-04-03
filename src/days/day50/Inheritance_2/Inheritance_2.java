package days.day50.Inheritance_2;

public class Inheritance_2 {
    public static void main(String[] args) {


        System.out.println( "Inheritance -2 in java");

        BChild child1 =new BChild();
        BChild child2= new BChild("Child");
        child1.setPrivateStr("Test setter");
        System.out.println("child1.getPrivateStr() = " + child1.getPrivateStr());
        child1.aMtehodChild();
        System.out.println("child1.getPrivateStr() = " + child1.getPrivateStr());
    }


}
