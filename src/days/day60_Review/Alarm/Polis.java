package days.day60_Review.Alarm;

public class Polis implements Alarm{
    @Override
    public void inform(Sensor sensor) {
        System.out.println( "Alarm gonderen istasyon : " + sensor.getPlace());
        System.out.println( " Polise bilgi verildi");
    }
    }

