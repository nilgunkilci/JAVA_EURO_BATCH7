package days.day60_Review.Alarm;

import java.util.ArrayList;

public class AlarmProgram {
    public static void main(String[] args) {

        System.out.println("Alarm Sistemi ver.1.0");
        System.out.println("______________________" );

        AlarmManager alarmManager = new AlarmManager();

        Sensor sensor1= new Sensor("ABC Plaza");

        alarmManager.inform(new Itfaiye(),sensor1);
        alarmManager.inform(new Polis(),sensor1);
        alarmManager.inform(new AcilServis(),sensor1);
        alarmManager.inform(new BirimServis(),sensor1);
        System.out.println("_______________________________");

        ArrayList<Alarm>alarms = new ArrayList<>();
        alarms.add(new Polis());
        alarms.add(new Itfaiye());
        alarms.add(new BirimServis());

        alarmManager.informList(alarms,sensor1);
    }
}
