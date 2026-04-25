package threading;

import java.sql.SQLOutput;

public class needofmultithreading {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();

        for(int i=0;i<=10;i++){
            System.out.print("*"+i);
        }
        System.out.println("first task done");

        for(int i=0;i<=10;i++){
            System.out.print("@"+i);
        }
        System.out.println("second task done");

        for(int i=0;i<=10;i++){
            System.out.print("$"+i);
        }
        System.out.println("third task done");

        long endtime=System.currentTimeMillis();
        long TotalTime=starttime-endtime;

        System.out.println("Starting time is "+ starttime);
        System.out.println("End time is "+endtime);

        System.out.println("Total time taken is "+ TotalTime);

    }
}
