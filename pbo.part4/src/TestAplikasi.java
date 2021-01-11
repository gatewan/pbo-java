import com.gatewan.aplikasi1.Kendaraan;
import com.gatewan.aplikasi1.Tank;
import com.gatewan.aplikasi2.Senjata;
//tanda (*) digunakan untuk mengimport semua class yang ada pada package
//contoh penulisan import com.gatewan.aplikasi1.*;

public class TestAplikasi {
    public static void main(String[] args){
        Kendaraan kl = new Kendaraan();
        kl.maju();
        kl.mundur();
        System.out.println(Kendaraan.jumlah);
        
        Tank tl = new Tank();
        tl.maju();
        tl.mundur();
       
        System.out.println(tl.jumlah);
        
        
        
        
    
    }
   
}