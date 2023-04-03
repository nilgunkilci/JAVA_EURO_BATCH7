package days.day60_Review.Fabrika;

public class FabrikaApplication {

    public static void main(String[] args) {

        Firm fabrika = new Firm("SDET Fabrikasi","ABC Plaza  no:3","www.abcsdet.com");

        // System.out.println("fabrika = " + fabrika);  ne var ne yok baktik :)
        Person muhendis1 = new Muhendis("Ahmet Falanca",35,"Istanbul Teknik Universitesi");
        Person muhendis2 = new Muhendis("Fatma Gül",25,"SDET Teknik Universitesi");

        Person ogretmen1 = new Ogretmen("Mustafa Cancan",55);
        Person ogretmen2 = new Ogretmen("Merry Christmas",45);

        Person isci1 = new Worker("Isci-1",35,"Üretim");
        Person isci2 = new Worker("Isci-2",25,"Pazarlama");
        Person isci3 = new Worker("Isci-3",44,"Üretim");
        Person isci4 = new Worker("Isci-4",58,"AR-GE");
        Person isci5 = new Worker("Isci-5",37,"Depo");


        Person isciOzel = new WorkerCanDrive("Isci arac kullanabilir",45,"Ulastirma");
        fabrika.addWorker(muhendis1);
        fabrika.addWorker(muhendis2);

        fabrika.addWorker(ogretmen1,ogretmen2,isci1,isci2,isci3,isci4,isci5,isciOzel);
        fabrika.listWorkers();
       //
        // System.out.println("fabrika = " + fabrika);

        System.out.println();
        fabrika.printInfo();
        fabrika.personDoWork();
    }
}
