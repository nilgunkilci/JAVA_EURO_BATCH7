package days.day54.Ev;

public class Mutfak {

    private String tarz;
    private int m2;
    private String dolap;
    private String zemin;

    public Mutfak(String tarz, int m2, String dolap, String zemin) {
        this.tarz = tarz;
        this.m2 = m2;
        this.dolap = dolap;
        this.zemin = zemin;
    }
    public void yemekYap(){
        System.out.println("Yemek pisiyor");
    }

    public String getTarz() {
        return tarz;
    }

    public int getM2() {
        return m2;
    }

    public String getDolap() {
        return dolap;
    }

    public String getZemin() {
        return zemin;
    }
}
