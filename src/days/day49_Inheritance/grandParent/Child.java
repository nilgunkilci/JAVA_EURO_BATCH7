package days.day49_Inheritance.grandParent;

public class Child extends Parent {
    int age;

    public Child (String name, String lastName, int age){
        super(name,lastName);
        this.age=age;

    }
    public void display(){
        super.display();
        System.out.println("Age of child : " + age);
    }



}
