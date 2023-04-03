package days.day10;

public class HWKapiZili {
    public static void main(String[] args) {
        /*Odev1 : Bir evin 2 kapisi ve 2 penceresi icin alarm sistemi programi yazın
        Ve verdiginiz degerlere gore alarm sisteminin calisip calismadigini test edin

         */
        boolean kapi1 = false;
        boolean kapi2=false;
        boolean pen1=false;
        boolean pen2=false;

        // kapi ve pencerenin kapali olma durumu true.
        // kapi ve pencerenin acik olma durumu false.
        // bu durumda 1 false durumu alarmi calistirmali.
        //

        boolean alarm = !(kapi1 && kapi2 && pen1 && pen2);
        System.out.println("alarm caliyor mu?  = " + alarm);

    }
}
