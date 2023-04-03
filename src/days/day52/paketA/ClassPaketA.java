package days.day52.paketA;

import days.day52.paketB.AccessModifiers;

public class ClassPaketA extends AccessModifiers{

    public static void main(String[] args) {

        AccessModifiers accessModifiers=new AccessModifiers(); // Baska bir paketten olusturuldugu icin import edildi.

        // Public
        accessModifiers.name= "Baska bir paketten erisim"; // public oldugundan baska bir paketteki classs tan da erisilebilir.
        accessModifiers.publicMtehod();

        // Protected
       //  accessModifiers.protectedMethod(); Protected tanimlandigi icin  baska bir package icerisindeki class tan dogrudan erisim olmaz
        // accessModifiers.TCNo=12345;

        // Default
        // accessModifiers.defaultMethod();
        // accessModifiers.okulNo;

        // Private
        // accessModifiers.privateToplama(12,45); private tanimli bir ögeye ayni package icinde bile olsa erisilemez
        // accessModifiers.id=10;

        ClassPaketA classPaketA = new ClassPaketA(); // ClassPaketA --> child   AccessModifiers --> parent
        classPaketA.TCNo=123456678L;
        classPaketA.protectedMethod();

    }
}
