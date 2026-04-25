package threading.threadclass;

public class thirdtask  extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("&"+i);
        }
        System.out.println("Third task completedd");
    }
}
