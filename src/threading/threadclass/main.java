package threading.threadclass;

public class main {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        firsttask t1=new firsttask();
        Secondtask t2=new Secondtask();
        thirdtask t3=new thirdtask();

        System.out.println("starting first task");
        t1.start();
        System.out.println("starting second task");
        t2.start();
        System.out.println("starting third task");
        t3.start();


        long endtime=System.currentTimeMillis();
        System.out.println("Total time taken is "+(endtime-start));

    }
}
