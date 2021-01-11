/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatika;

/**
 *
 * @author Wawan Chahyo Nugroho
 */
public class Aritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nilai1 = "700";
        String nilai2 = "7878";
        String nilai3 = "2323";
        String nilai4 = "1212";
        double nilai5 = 800;
        double nilai6 = 899;
        double nilai7 = 89898;
        double nilai8 = 898;
        
        Perkalian hit = new Perkalian();
        
        System.out.print("\"700\" x 800 = ");
        System.out.println(hit.kali(Double.parseDouble(nilai1), nilai5));
        System.out.print("899 x 89898 = ");
        System.out.println(hit.kali(nilai6, nilai7));
        System.out.print("898 x \"7878\" = ");
        System.out.println(hit.kali(nilai8, Double.parseDouble(nilai2)));
        System.out.print("\"2323\" x \"1212\" = ");
        System.out.println(hit.kali(Double.parseDouble(nilai3), Double.parseDouble(nilai4)));
        
    }
    
}
