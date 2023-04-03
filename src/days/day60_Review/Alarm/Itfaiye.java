package days.day60_Review.Alarm;

public class Itfaiye implements Alarm{


    @Override
    public void inform(Sensor sensor) {
        System.out.println( "Alarm gonderen istasyon : " + sensor.getPlace());
        System.out.println( " Itfaiyeye bilgi verildi");
    }
}
