package days.day44_StaticMembers1;

public class Ulkeler {
    // Static varable-Class variable
    static  int ulkelerSayac;

    // instance variables
    int dummyCounter;
    String name;
    String ulkeKod;
    int intTelCode;

    public Ulkeler(String name, String ulkeKod, int intTelCode) {
        ulkelerSayac++;
        dummyCounter++;
        this.name = name;
        this.ulkeKod = ulkeKod;
        this.intTelCode = intTelCode;
    }

    @Override
    public String toString() {
        return "Ulkeler{" +
                "dummyCounter=" + dummyCounter +
                ", name='" + name + '\'' +
                ", ulkeKod='" + ulkeKod + '\'' +
                ", intTelCode=" + intTelCode +
                '}';
    }
}
