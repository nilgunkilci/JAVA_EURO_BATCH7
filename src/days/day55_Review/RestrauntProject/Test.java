package days.day55_Review.RestrauntProject;

public class Test {
    public static void main(String[] args) {

        Chef chef = new Chef("Mahmut","Iskender");
        Waiter[] waiters= {new Waiter ("Hasan", true),new Waiter("Ayse",false) };
        Table[] tables = {new Table(1,2),new Table(2,4),new Table(3,4)};

        Restaurant restaurant = new Restaurant(chef,waiters,tables);
        restaurant.serve("Iskender", 2,4);
        System.out.println("--------------------------");
        restaurant.serve("döner",1,4);
    }
}
