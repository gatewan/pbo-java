package simpledatetime;

public class UnSynchCounter implements Counter {
    private final static Random random = new Random();
    private int val = 0;
    public void increament (String sender){
        int last = val;
        try {
            Thread.sleep(random.nextInt(500));
        } catch (InterruptedExeption ex) {
                System.out.println(ex.getMessage());
        }
        val++;
        System.out.println(sender + "-Inc\tLast :"+ last
        +"\tNew:"+val);
    }
    public void decreament(String sender){
        private final static Random random = new Random();
        private int val = 0;
        public void increament (String sender){
        int last = val;
        try {
            Thread.sleep(random.nextInt(500));
        } catch (InterruptedExeption ex) {
                System.out.println(ex.getMessage());
        }
        val--;
        System.out.println(sender + "-Inc\tLast :"+ last
        +"\tNew:"+val);
    }
}
