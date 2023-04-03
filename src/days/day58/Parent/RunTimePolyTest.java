package days.day58.Parent;

public class RunTimePolyTest {

    public static void main(String[] args) {


        // Run Time Polymorphism / Dynamic Polymorphism / Method Overriding
        Parent obj= new Parent();
         obj.print();

         Child1 obj1= new Child1();
         obj1.print();

         Child2 obj2 = new Child2();
         obj2.print();

    }
}
