public class Utama {

    public static void main(String[] args) {
       MyThread obj = new MyThread();
       Thread thread1 = new Thread(obj);
       thread1.start();
       
        try {
            thread1.sleep(3000);
            thread1.interrupt();
        } catch (Exception e) {
        }
    }
    
}
