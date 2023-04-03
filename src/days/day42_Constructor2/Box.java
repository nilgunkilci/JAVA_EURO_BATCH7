package days.day42_Constructor2;

public class Box {

    int width;
    int length;


    Box(){
        System.out.println("Default constructor called");
    }

    public Box(int width, int length) {
        System.out.println(" Two parameters constructors");
        this.width = width;
        this.length = length;
    }
    Box(Box box){ // Copying two objects each other
        this.width=box.width;
        this.length=box.length;
    }
    public int  araeCalculator (){
        return this.length*this.width;
      //  System.out.println("Alan = " + this.width * this.length);

    }
    public void showInfo(){
        System.out.println(" Kutunun en degeri = " + this.width);
        System.out.println(" Kutunun boy degeri = " + this.length);
        System.out.println(" Kutunun alani = " + this.araeCalculator());
    }
    public String strShowInfo(){
        String str="";
        str += " Kutunun en degeri = " + this.width +"\n";
        str +=" Kutunun boy degeri = " + this.length +"\n";
        str +=" Kutunun alani = " + this.araeCalculator();
        return str;
    }
    public String toString() {
        String str = "";
        str += " Kutunun en degeri = " + this.width + "\n";
        str += " Kutunun boy degeri = " + this.length + "\n";
        str += " Kutunun alani = " + this.araeCalculator();
        return str;
    }
    public  boolean esitMi ( Box box){
        if ( this.width== box.width&& this.length==box.length){
            return true;
        }else
            return false;

    }


    /* public static void main(String[] args) {

        Box box;        // declaration
        box= new Box(); // Object created.

        String str ; // Declaration
        str="mJava"; // Assignment

        Box box1= new Box(); // Declaration and creation in same row.

        box.length=10;
        box.width=25;

        box1.length=23;
        box1.width=56;
        }
    */


    }

