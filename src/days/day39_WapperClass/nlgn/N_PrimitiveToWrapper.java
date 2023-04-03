package days.day39_WapperClass.nlgn;

public class N_PrimitiveToWrapper {
    public static void main(String[] args) {


        int num1 = 21;
        double num2 = 34.8;
        boolean bol = true;
        String str= "12345";
        // Conversion method , primitive variableleri object e cevirme method u.
        // Wrapper object olustururken, parametre olarak primitive data type lar gonderilebilr.
        Integer str1= Integer.valueOf(str);
        Integer object1 = Integer.valueOf(num1);
        // Integer object2= Integer.valueOf(num2); *** Error Kendi turunde bir object olusturmali
                                                        // ya da otomatik casting yapabilecegi bir data turu gondermeli. .
        Integer obj= Integer.valueOf((int)num2); // ya da Explicit casting yaparak gondermeli
        System.out.println("obj = " + obj);
        System.out.println("object1 = " + object1);

        Double object2 = Double.valueOf(num2);
        Double object3= Double.valueOf(num1);   // num1 int data type olsa bile otomatik ( implicit) casting yapiyor.
        System.out.println("object2 = " + object2);
        System.out.println("object3 = " + object3);

        Boolean object4= Boolean.valueOf(bol);
        System.out.println("object4 = " + object4);


        // instanceOf  Operator , olusturulan object in belirtilen sinifa ait olup olmadigini belirtiyor.

        System.out.println("object1 instanceof Integer = " + (object1 instanceof Integer));
        // System.out.println("(object2 instanceof Integer) = " + (object2 instanceof Boolean)); //** Error
        System.out.println("object2 instanceof Double = " + (object2 instanceof Double));


    }
}
