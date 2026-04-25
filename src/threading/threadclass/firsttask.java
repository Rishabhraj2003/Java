package threading.threadclass;

public class firsttask  extends  Thread{
    @Override
    public void  run(){
        for(int i=0;i<10;i++){
            System.out.println("@"+i);
        }
        System.out.println("First task commpleted");
    }
}
