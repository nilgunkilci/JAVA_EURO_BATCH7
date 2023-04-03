package days.day51_Review._Car;

public class Truck extends Car{

    public String m1(){
         return "truck1";
    }
    public String m2(){
    return super.m1();
    }
    public String run(){
        //super.run();
       return super.run()+"vrommmm";
    }
}
