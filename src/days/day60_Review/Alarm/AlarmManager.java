package days.day60_Review.Alarm;

import java.util.ArrayList;

public class AlarmManager {
    public  void inform( Alarm alarm, Sensor sensor){
        alarm.inform(sensor);
    }

    public void informList(ArrayList<Alarm> alarms,Sensor sensor){
        System.out.println("Listede olan birimlere bilgi verildi");
        for (Alarm alarm:alarms){
            alarm.inform(sensor);
        }
    }
}
