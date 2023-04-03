package days.day37_Arrays;

import java.util.Arrays;

public class IkiBoyutluArrayler2 {

    public static void main(String[] args) {

        //  birinciSira  80 90  70  100
        // ikinciSira   90  70  60  80
        // ucuncuSira   70  60  100 90

        int [] notlar[]={
                {80,90,70,10},
                {90,70,60,80},
                {70,60,100,90}
        };

        System.out.println("Arrays.toString(notlar[0]) = " + Arrays.toString(notlar[0]));
        System.out.println("Arrays.toString(notlar[1]) = " + Arrays.toString(notlar[1]));
        System.out.println("Arrays.toString(notlar[2]) = " + Arrays.toString(notlar[2]));

        int []aliNot={10,5,9,8};
        System.out.println("Arrays.toString(aliNot) = " + Arrays.toString(aliNot));
        for(int i=0;i<4;i++){
            System.out.println("aliNot = " + aliNot[i]);

        }
        for (int not:aliNot) {
            System.out.println("not = " + not);
        }
        System.out.println(" for each calisiyor");
        for(int[]sira:notlar){
            for(int not:sira){
                System.out.print(not+" ");
            }
            System.out.println();
        }



    }
}
