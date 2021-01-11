package teoriPBO;
/**
 * Luas Segitiga 
 * @author Wawan Chahyo Nugroho
 */

public class segitiga294 {
    private float alas, tinggi; // private atribut
    
     
    //Mutator Validasi Input
    public void initialAlas (float a){ 
    if (a != 0){
    alas = a;
    }
    else {
    System.out.println("Input tidak boleh 0");
    }
    }
    
    public void initialTinggi (float t){ 
    if (t != 0){
    tinggi = t;
    }
    else {
    System.out.println("Input tidak boleh 0");
    }
    }
    
   
public String getluas(){
double luas;
luas = 0.5 * alas * tinggi;
String hasil = Double.toString(luas);
//Validasi input
if (alas == 0 || tinggi == 0){
hasil = "Error result!!!";
}

return hasil;
}

    void getLuas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
    
    
    
    
   
       
