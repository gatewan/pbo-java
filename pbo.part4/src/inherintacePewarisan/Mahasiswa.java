
package inherintacePewarisan;

/**
 *
 * @author Wawan Chahyo Nugroho
 */
public class Mahasiswa extends Orang {
    //extends digunakan untuk menurunkan isi class induk ke klas 
    String nim;

    public void info(){
    super.info();
    System.out.println("NIM : " + nim);
    }
}
