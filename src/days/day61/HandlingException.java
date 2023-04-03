package days.day61;

public class HandlingException {

    public static void main(String[] args) {



        try{
            // try block
            // code throws exception

        }catch (Exception e){  // Exception Class and referance for the object

            // catch block
            // Handling exception
        }
        System.out.println("////////////////////////////////");
        try{
            System.out.println(1/0 );

        }catch(Exception e){
            System.out.println("Can not divided zero");
        }
        System.out.println("////////////////////////////////");

        // getting Exception
        System.out.println("Start Test ");
        System.out.println("Run Test");



        try{
            System.out.println(" Calculation " + 1/0 );
        }catch(Exception e){
            System.out.println("Can not divided zero");
        }
        System.out.println("End Test");


        System.out.println("/////////////////////////////");


        // not getting Exception  if not handled
        System.out.println("Start Test ");
        System.out.println("Run Test");



        try{
            System.out.println("Calculation " + 1/1);
        }catch(Exception e){
            System.out.println("Can not divided zero");
        }
        System.out.println("End Test");
        //Start Test
        //Run Test
        //Calculation 1
        //End Test
    }
}
