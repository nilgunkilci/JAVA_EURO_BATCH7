package days.day60_Review.Fabrika;

public abstract class Person {

    // Burasi Parent Class
    // Ayni zamanda abstract class yaptik bunu.
    // cunku buradan bir obje olusturmak istemiyoruz. fakat bu classi miras alan child classlardan obje olusturulabilir.
    // sadece kurallari belirlemek ve temel bilgileri belirlemek istiyoruz

    protected String name;
    protected int age;                  //??????????

    public Person (String name,int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // abstract methodlar , child classlar tarafindan kullanilabilir.
    // abstract methodlarin body olmaz. yani süslü parantez yoktur.
   // bu methodlar child methodlarda olmak zorunda
    public abstract void work();
    public abstract String showInfo();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
