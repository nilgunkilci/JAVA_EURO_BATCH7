package days.day52.paketB;

public class ClaA {
    public static void main(String[] args) {

        AccessModifiers accessModifiers= new AccessModifiers(); // import yapilmasina gerek yok. cünkü ayni package icindeler
        // Private
        // accessModifiers.privateToplama(12,45); private tanimli bir ögeye ayni package icinde bile olsa erisilemez
        // accessModifiers.id=10;

        // Default
        accessModifiers.defaultMethod();
        accessModifiers.okulNo= 3456;  // her ikisi de default tanimlandigi ve ayni package icinde olduklari icin erisilebilir

        // Protected
        accessModifiers.protectedMethod();  //
        accessModifiers.TCNo= 123456788986L;

        // Public
        accessModifiers.publicMtehod();     //
        accessModifiers.name= "Eslem";
    }
}
