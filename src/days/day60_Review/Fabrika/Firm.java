package days.day60_Review.Fabrika;

import java.util.ArrayList;

public class Firm {
    private String name;
    private String address;
    private String webAddress;

    private ArrayList<Person> firmWorkers;

    public Firm(String name, String address, String webAddress) {
        this.name = name;
        this.address = address;
        this.webAddress = webAddress;
        this.firmWorkers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public ArrayList<Person> getFirmWorkers() {
        return firmWorkers;
    }

    public void addWorker(Person person) {
        this.firmWorkers.add(person);
    }

    public void addWorker(Person... persons) { // var args: variable argument
        for (Person person1 : persons) {
            // this.firmWorkers.add(person1);
            addWorker(person1);   //  isci arraylistene eklemeyi bir üstteki methodu cagirarak yapiyoruz
        }
    }

    public void listWorkers() {
        System.out.println(" Firmada calisanlarin listesi");
        for (Person person : firmWorkers) {
            System.out.println("person.showInfo() = " + person.showInfo());
        }
    }

    public void printInfo() {

        int numberOfMuhendis = 0;
        int numberOfOgretmnen = 0;
        int numberOfWorkers = 0;

        System.out.println(" Fabrika ad    : " + this.getName());
        System.out.println( "Fabrika adres : " + this.getAddress());
        System.out.println(" Web adresi    : " + this.getWebAddress());
        System.out.println("___________________________________________");

        for ( Person person:firmWorkers) {
            if (person instanceof Muhendis) {
                numberOfMuhendis++;
            }
            if (person instanceof Ogretmen) numberOfOgretmnen++;
            if (person instanceof Worker) numberOfWorkers++;


        }
        System.out.println(" Fabrikada calisan personelin türlerine göre sayilari");
        System.out.println("______________________________________________");
        System.out.println("numberOfMuhendis = " + numberOfMuhendis);
        System.out.println("numberOfOgretmnen = " + numberOfOgretmnen);
        System.out.println("numberOfWorkers = " + numberOfWorkers);
    }
    public void personDoWork(){
        for (Person person: firmWorkers){

            System.out.println(person.getName());
            person.work();
            if (person instanceof Muhendis)((Muhendis) person).design();   // downcasting yapildi
            if (person instanceof Ogretmen) ((Ogretmen) person).teach(); // downcasting yapildi
            if (person instanceof WorkerCanDrive)((WorkerCanDrive) person).drive();
        }
    }

    @Override
    public String toString() {
        return "Firm{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", webAddress='" + webAddress + '\'' +
                ", firmWorkers=" + firmWorkers +
                '}';
    }
}
