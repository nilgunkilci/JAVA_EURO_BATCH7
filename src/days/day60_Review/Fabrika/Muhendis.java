package days.day60_Review.Fabrika;

public class Muhendis extends Person{

    private String universite;

    public Muhendis(String name, int age,String universite){
        super(name,age);
        this.universite=universite;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public void work(){
        System.out.println(this.getName()+" bu fabrikada muhendis olarak calisiyorum");
    }
    public String  showInfo( ){
       return  this.getName() + " - " + this.getAge() +" yasindayim." + getUniversite() + " mezunuyum";
    }
    public void design(){
        System.out.println(" Ben bir muhendisim ve tasarim yapiyorum");
    }

    @Override
    public String toString() {
        return "Muhendis{" +
                "universite='" + universite + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
