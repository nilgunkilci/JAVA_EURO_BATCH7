package days.day46_Encapsulation;

public class Person {

    private String name;
    private int age;

    public Person(){}


    // Parametre alan public constructor in encapsule edilmis fieldlara bir istisna olusturmasini istemiyorsak
    // Constructor icerisinde dogrudan assignment yapmak yerine setter methodlari cagrilir.

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName(){

        return this.name;
    }
    public void setName(String name){

        this.name=name;
    }
    public int getAge(){

        return this.age;
    }
    public void setAge(int age){
        // istenilmeyen atamalari engellemek icin  buraya condition konulmalidir.
        if (age>0){
            this.age=age;
        }


    }
    public void print(){
        System.out.println(this.name);
    }
}
