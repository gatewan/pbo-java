public class SmartPhone_12131283 extends Multimedia_12131283 implements Proses_12131283{

    @Override
    public void on() {
        System.out.println("Smart Phone Starting");
    }

    @Override
    public void off() {
        System.out.println("Smart Phone Shut Down");
    }

    @Override
    public void display() {
        System.out.println("Smart Phone Stand By");
    }

    public void sendMessage() {
        System.out.println("Smart Phone Sending Message");
    }

    public void receiveMessage() {
        System.out.println("Smart Phone Receiving Message");
    }
    
}
