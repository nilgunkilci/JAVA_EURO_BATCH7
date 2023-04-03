package days.day51_Review._Vehicle;

public class Vehicle {
    public int wheels;
    public int weight;
    public  Vehicle ( int wheels ){
        this.wheels= wheels;

    }
    public  Vehicle ( int wheels,int weight){
        this.wheels= wheels;
        this.weight= weight;
    }
    public void move(){
        System.out.println(" Vehicle can move");
    }
    public void stop(){
        System.out.println("Vehicle can stop");
    }
}
