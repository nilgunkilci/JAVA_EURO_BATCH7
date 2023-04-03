package days.day47;

import java.util.ArrayList;

public class JobTest {
    public static void main(String[] args) {

        Job job1 = new Job();
        Job job2 = new Job("Developer");
        Job job3 = new Job("SDET", "Google", 100000);
        System.out.println("-------");
        System.out.println(job1.toString());
        System.out.println("----");
        System.out.println(job2.toString());
        System.out.println("-----");
        System.out.println(job3.toString());
        System.out.println("---------");
        // Job objectleri store edebilecegimiz bir list olusturmak
        // Bu listeye 5 adet job object ekleyin

        ArrayList<Job> jobs =new ArrayList<>();

        jobs.add(new Job("SDET","Google",1234) );
        jobs.add(new Job("SM","Facebook",200000) );
        jobs.add(new Job("BA","Amazon",120000) );
        jobs.add(new Job("PO","Twitter",1000000) );
        jobs.add(new Job("Devops","Chip",1500000) );



        System.out.println(jobs.toString());




    }



    }

