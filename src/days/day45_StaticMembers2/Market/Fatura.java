package days.day45_StaticMembers2.Market;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Fatura {

    static  int id= 1000;
    static  int faturaNo;
    static String firmaAdi;
    static String firmaAdresi;
    static String firmaTelNo;

    Date faturaTarihi;
    Sepet sepet ;

    static {
        firmaAdi= "ABC Market Ticaret Sirketi";
        firmaAdresi = "ABC Plaza  4. Kat no: 1234 Istanbul/ Turkiye";
        firmaTelNo= " +90 216 12344556";

    }
    public Fatura(Date faturaTarihi, Sepet sepet){
        this.faturaTarihi= faturaTarihi;

        this.sepet= sepet;
        id++;
        faturaNo=id;
    }

    public String toString(){
        SimpleDateFormat tarihFormat = new SimpleDateFormat("dd-MMMM-yyyy    HH:mm:ss");
        String str = firmaAdi+ "\n";
        str+= firmaAdresi +"\n";
        str += "                    " + firmaTelNo +" \n\n";
        str += " Fatura :  " + faturaNo +        "   Tarih/ Saat  : " + tarihFormat.format(faturaTarihi)+ "\n";
        str += "------------------------------------\n";
                str += sepet;
                return str;

    }

}
