package gatewan;
/**
 * Luas Segitiga 
 * @author Wawan Chahyo Nugroho 12131294
 */

public class segitiga294 {
    private double alas;
    private double tinggi; // private atribut
    
     
    //Mutator Validasi Input
    public void initialAlas (double a){ 
    if (a != 0){
    alas = a;
    }
    else {
    System.out.println("Input alas tidak boleh 0");
    }
    }
    
    public void initialTinggi (double t){ 
    if (t != 0){
    tinggi = t;
    }
    else {
    System.out.println("Input tinggi tidak boleh 0");
    }
    }
    
//accsessor   
public String getluas(){
double luas;
luas = 0.5 * alas * tinggi;
String hasil = Double.toString(luas);
//Validasi input luas
if (alas == 0 || tinggi == 0){
hasil = "Error result!!!";
}

return hasil;
}
}
    
    
    
    
   
       
