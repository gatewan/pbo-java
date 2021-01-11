package gatewan;

public class App {

    
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        k.setBilangan1(20);
        k.setBilangan2(5);
        k.setOperator('-');
        k.proses();
        
    }
}

class Kalkulator{
    private int bilangan1;
    private int bilangan2;
    private char operator;

    public void setBilangan1(int bilangan1) {
        this.bilangan1 = bilangan1;
    }

    public void setBilangan2(int bilangan2) {
        this.bilangan2 = bilangan2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
    
    public void proses (){
        System.out.print(bilangan1);
        System.out.print(operator);
        System.out.print(bilangan2);
        System.out.println(" = " + hitung ());
}

    private float hitung(){
        if (operator == '+'){
            return bilangan1 + bilangan2;
        }
        else if (operator == '-' ){
            return bilangan1 - bilangan2;
        }
        else if (operator == '*'){
            return bilangan1 * bilangan2;
        }
        else if (operator == '/'){
            return bilangan1 / bilangan2;
        }
        return 0;
    }
  
}
