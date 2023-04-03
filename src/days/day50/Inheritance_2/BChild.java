package days.day50.Inheritance_2;

public class BChild extends AParent {
    String name;
    BChild(){ // Constructor
        super();   // Base Class constructor cagrisi // bu yazilmasa bile default olarak cagriliyor. ilk atirda olmali
        System.out.println("Child  class constructor ");
    }
    // constructorda this ve super constructor ayni yerde olamaz. cunku her ikiside ilk sirada olmali
    BChild(String name){ // Parametreli constructor
        this();  // Sub Classs constructor cagrisi. ilk satirda olmali
        this.name=name;
    }
    public void aMtehodChild(){
        super.parentFieldStr= " Assigment from Child class";
        super.parentFieldInt= 10;
        super.setPrivateStr("Sub class sette assignent ");
    }

}

