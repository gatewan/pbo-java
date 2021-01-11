public class Test_12131283 {
    public static void main(String[] args) {
        System.out.println("------Monitor------");
        Monitor_12131283 monitor = new Monitor_12131283();
        monitor.on();
        monitor.off();
        monitor.display();
        
        System.out.println("\n----Smart Phone----");
        SmartPhone_12131283 smart = new SmartPhone_12131283();
        smart.on();
        smart.off();
        smart.display();
        smart.sendMessage();
        smart.receiveMessage();
        smart.playVideo();
        
        System.out.println("\n-----Computer------");
        Computer_12131283 comp = new Computer_12131283();
        comp.on();
        comp.off();
        comp.display();
        comp.playVideo();
        
    }
}
