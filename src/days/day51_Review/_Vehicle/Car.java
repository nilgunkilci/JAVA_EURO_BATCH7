package days.day51_Review._Vehicle;

import days.day51_Review._Vehicle.Vehicle;

public class Car extends Vehicle {
    public String model;

    public Car(int wheels, int weight, String model) {
        super(wheels, weight); // calling the constructor of Super class
        //super(wheels); ayni constructor icinde 2 tane super cagri olamaz
        this.model = model;
    }
    public Car(int wheels,String model) {
        super(wheels); // calling the constructor of Super class
        //super(wheels); ayni constructor icinde 2 tane super cagri olamaz
        this.model = model;
    }
    public void hank(){
        System.out.println(" Cars can honk");
    }
    public void move(){
        super.move(); // calling the method of Super Class
        System.out.println(" Cars can move on the roads");
    }
    public void getWheels(){
        System.out.println("Number of Whells of the car is : "+ super.wheels);  // calling the instance variable of Super Class
    }
}
