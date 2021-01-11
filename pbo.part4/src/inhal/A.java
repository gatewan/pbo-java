
package inhal;

public class A extends B{
  public void info() {
        System.out.println("info class b"); 
  }
}

class B {
    public void info() {
        System.out.println("info class");
    
    }

}

class Test2 {
public static void main(String[] args){
    A a = new A();
    a.info();
    
    B b = new B();
    b.info();
}

}
