package days.day51_Review._Car;

public class Cartest {
    public static void main(String[] args) {

        Monster monster = new Monster();
        System.out.println(monster.run());
        System.out.println("-----------------");
        System.out.println(monster.m2());
        System.out.println("-------------");
        System.out.println(monster.m1());
        System.out.println("------------");

        Truck truck = new Truck();
        System.out.println(truck.m1());
        System.out.println("----------");
        System.out.println(truck.m2());
        System.out.println("----------");
        System.out.println(truck.run());
    }
}
