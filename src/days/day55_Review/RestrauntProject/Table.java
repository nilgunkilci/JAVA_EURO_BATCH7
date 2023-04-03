package days.day55_Review.RestrauntProject;

public class Table {
    private int number;
    private  int seats;

    public Table(int number, int seats) {
        this.number = number;
        this.seats = seats;
    }

    public void reserve(int guests){
        if (guests<= seats){
            System.out.println("Table number " + number + " reserved for" +guests + " guests");
        }else {
            System.out.println(" Table number " + number + " can only seat " + seats + " guests");
        }
    }

    public int getNumber() {
        return number;
    }
}
