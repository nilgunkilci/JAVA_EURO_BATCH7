package days.day54.Car;

public class Engine {
    private  int horsePower;
    public Engine(int horsePower){
        this.horsePower=horsePower;
    }
    void start(){
        System.out.println("Engine srarted with "+horsePower+"horsePower");
    }
}
