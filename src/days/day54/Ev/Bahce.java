package days.day54.Ev;

public class Bahce {
    private String zemin;
    private String cit;
    private String mangal;
    private boolean havuzVarMi;

    public Bahce(String zemin, String cit, String mangal, boolean havuzVarMi) {
        this.zemin = zemin;
        this.cit = cit;
        this.mangal = mangal;
        this.havuzVarMi = havuzVarMi;
    }
    public void sulamaYap(){
        System.out.println("Bahce sulaniyor");
    }

    public String getZemin() {
        return zemin;
    }

    public String getCit() {
        return cit;
    }

    public String getMangal() {
        return mangal;
    }

    public boolean isHavuzVarMi() {
        return havuzVarMi;
    }
}
