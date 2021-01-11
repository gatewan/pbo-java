
package inhal;

public class Test {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("12131294");
        mhs.setNama("Wawan Chahyo Nugroho");
        mhs.setAngkatan("13");
        mhs.setJurusan("TI");
        Nilai nilai = new Nilai(90, 90, 90);
        mhs.setNilai(nilai);
        
        
        
        System.out.println("NIM : " + mhs.getNim());
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("Angkatan : " + mhs.getAngkatan());
        System.out.println("Jurusan : " + mhs.getJurusan());
        System.out.println("Nilai : " + mhs.getNilai());
    }
    
}
