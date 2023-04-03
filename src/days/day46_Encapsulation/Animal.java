package days.day46_Encapsulation;

public class Animal {

    private String species;
    private int age;

    public Animal(String species,int age){
        this.species=species;
        this.age=age;
    }
    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species){

        this.species=species;
    }
    public int getAge() {

        return age;
    }
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else{

        }
    }
    public void haveBirthday(){

        this.age++;
    }
}
