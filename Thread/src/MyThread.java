
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyThread implements Runnable{
    private boolean isFinish=false;
    public void setFinish(boolean finish) {
        isFinish=finish;
    }
    
  public void run(){
      try {
          while(!isFinish){
              Calendar cal = Calendar.getInstance();
              SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
              System.out.println("Jalan pada " +dt.format(cal.getTime()));
              Thread.sleep(1000);
          }
      } catch (Exception e) {
      }
  }
  
}
