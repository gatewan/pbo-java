package inherintacePewarisan;

/**
 *
 * @author Wawan Chahyo Nugroho
 */
public class Orang {
//private -> tidak bisa diturunkan ke class anaknya atau turunanya
//protected -> masih bisa diturunkan ke class anaknya selama masih dalam satu package

protected String nama;
protected String hobi;
int usia;

public void info(){
    System.out.println("Nama : " + nama);
    System.out.println("Hobi : " + hobi);
    System.out.println("Usia : " + usia);
    }
}
