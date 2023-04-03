package days.day50.Inheritance_2;

public class AParent {
    String parentFieldStr;
    int parentFieldInt;
    private String privateStr;

    AParent(){
        System.out.println( " Super class constructor");
    }
    public void setPrivateStr(String str){
        this.privateStr=str;
    }
    public String getPrivateStr(){
        return privateStr;
    }

    public   void sMethod(){
        System.out.println(" I am a Method of parentclass");

    }


}
