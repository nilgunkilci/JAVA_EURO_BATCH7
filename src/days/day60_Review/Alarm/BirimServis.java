package days.day60_Review.Alarm;

public class BirimServis implements Alarm{
    @Override
    public void inform(Sensor sensor) {
        System.out.println( "Alarm gonderen istasyon : " + sensor.getPlace());
        System.out.println( "Birim Servisimize  bilgi verildi");
    }
}
