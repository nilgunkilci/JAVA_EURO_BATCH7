package days.day51_Review._Car;

public class Monster extends Car{
    public String m1(){
         return "monster1";
    }
    public String m2(){
       // super.m1();
        Truck truck=new Truck();

        return truck.m1()+" "+super.m1() ;
    }
    public String run(){
        //super.run();

        return "monster "+super.run()+" vrommmm";
    }
}
