package days.day55_Review.RestrauntProject;

public class Chef {
    private String name;
    private  String speciality;
    public Chef(String name,String speciality){
        this.name = name;
        this.speciality= speciality;
    }
    public  void cook(){
        System.out.println( name + " is cooking " + speciality);
    }

}
