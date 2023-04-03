package days.day69_REview;

public class PersonKisi {

    int tCNo;
    String name;
    String adres;

    public PersonKisi(int tCNo, String name, String adres) {
        this.tCNo = tCNo;
        this.name = name;
        this.adres = adres;
    }

    public int gettCNo() {
        return tCNo;
    }

    public void settCNo(int tCNo) {
        this.tCNo = tCNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "PersonKisi{" +
                "tCNo=" + tCNo +
                ", name='" + name + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
