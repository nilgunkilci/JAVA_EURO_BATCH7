package days.day55_Review.RestrauntProject;

public class Waiter {
    private String name;
    private boolean isAvailable;

    public Waiter(String name, boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;
    }
    void takeOrder(String order){
        if (isAvailable){
            System.out.println(name+ " waiter is taking order for " +order);
        }else {
            System.out.println(name +" waiter is nor avaible");
        }
    }
}
