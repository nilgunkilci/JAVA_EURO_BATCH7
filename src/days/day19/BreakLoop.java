package days.day19;

public class BreakLoop {
    public static void main(String[] args) {

        for (int i=1;i<=20;i++){

            if (i%5==4){
                System.out.println("Condition a uyan rakam : "+ i);
                break;
            }
        }
    }
}
