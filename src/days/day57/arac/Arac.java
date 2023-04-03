package days.day57.arac;

public abstract class Arac {

     /*
    Task
     Abstraction prensiplerini kullanarak bir arac (Vehicle) konsepti olusturun
     teker ve renk olarak 2 instance
     ve arac kullanma adinda bir abstract method olsun
     ayni zamanda renk instance ini set edecek bir instance method olusturun,
      diger class objectleri da bu method u kullansin
     Araba, Kamyon, motosiklet ve bisiklet class lari bu konsepte dahil olup,
     kendi constructorlarinda teker sayisini belirleyip
     zorunlu olan abstract methodun implamantasyonunu aracin ozelliklerini gostererek yapsinlar
     Test classinda da her bir aracin ozellilerini gosterelim
     */

    protected int wheels;
    protected String color;

    public abstract void drive();

    public void setRenk(String color) {
        this.color = color;
    }
}


