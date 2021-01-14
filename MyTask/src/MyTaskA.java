
import java.util.Random;

public class MyTaskA {
    private final static Random random = new Random();
    private final Counter sharedCounter;
    private String threadName;
    public MyTask(String name, Counter shared){
        threadName=name;sharedCounter=shared;
    }
    public void run(){
        for(int i=0;i<3;i++){
            try {
                sharedCounter.icreaman
            } catch (Exception e) {
            }
        }
    }
}
