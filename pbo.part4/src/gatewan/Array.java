
package gatewan;

public class Array {

    public static void main(String[] args) {
        // deklarasi array
        // tipe-data variabel[] atau tipe-data[] variabel = new tipe-data[N]
        // String variabel[] = {"Andi","Aziz","Bude"};
        // int variabel[] = {90, 100, 70};
        String daftarMahasiswa[] = new String[3];
        daftarMahasiswa[0] = "Andi";
        daftarMahasiswa[1] = "Aziz";
        daftarMahasiswa[2] = "Bude";
        
        
        int[] daftarNilai = new int[3];
        daftarNilai[0] = 90;
        daftarNilai[1] = 100;
        daftarNilai[2] = 70;
        
        
        int jumlah = daftarMahasiswa.length;
        for (int i = 0; i < jumlah; i++) {
            System.out.print(daftarMahasiswa[i]);
            System.out.println(" = " + daftarNilai[i]);
            
            
          
        }
        // menampilkan nilai terkecil
        
    }
    
}
