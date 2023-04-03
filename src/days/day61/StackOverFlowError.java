package days.day61;

public class StackOverFlowError {

    public static void main(String[] args) {
        recursiveMethod();
    }
    public static void recursiveMethod(){
        //Method kendi kendini cagiriyor.
        // Run Time Error  / StackOverFlowError
       // recursiveMethod();
    }
}
