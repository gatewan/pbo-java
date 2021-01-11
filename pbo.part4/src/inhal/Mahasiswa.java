
package inhal;

public class Mahasiswa {
 
    private String nim;
    private String nama;
    private String angkatan;
    private String jurusan;
    private Nilai nilai;
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public Nilai getNilai() {
        return nilai;
    }

    public void setNilai(Nilai nilai) {
        this.nilai = nilai;
    }

   

    
}

class Nilai{
private int uts;
private int uas;
private int tugas;

    public Nilai(int uts, int uas, int tugas) {
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    public String toString(){
     return ((uts + uas + tugas) / 3) + "";
    }
       

}
    
