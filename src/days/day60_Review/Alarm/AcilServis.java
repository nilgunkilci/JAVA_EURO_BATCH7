package days.day60_Review.Alarm;

public class AcilServis implements Alarm{
    @Override
    public void inform(Sensor sensor) {
        System.out.println( "Alarm gonderen istasyon : " + sensor.getPlace());
        System.out.println( "Acil Servise bilgi verildi");
    }
}
