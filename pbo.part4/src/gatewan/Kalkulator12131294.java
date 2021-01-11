package gatewan;

import java.util.Scanner;

/**
 * Tugas PBO 1
 * Completed at 21 maret 2015
 * @author Wawan Chahyo Nugroho
 */
public class Kalkulator12131294 {
static float total = 0, bil1 = 1, bil2 = 1;// global
 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    
    while(bil2 != 0 & bil1 != 0){
     System.out.println("Kalkulator Sederhana");
     System.out.println("1.Penjumlahan");
     System.out.println("2.Pengurangan");
     System.out.println("3.Perkalian");
     System.out.println("4.Pembagian");
     System.out.print("Masukan Pilihan Anda = ");
     int pilihan = input.nextInt();
        
        System.out.print("Masukan Bilangan Ke-1 = ");
        bil1 = input.nextFloat();
        System.out.print("Masukan Bilangan Ke-2 = ");
        bil2 = input.nextFloat();
          
        switch(pilihan){
            
            case 1:
            System.out.println( + bil1 + " + " + bil2 );
            System.out.print("Hasilnya = ");
            total = bil1 + bil2;
            break;
            case 2:
            System.out.println( + bil1 + " - " + bil2 );
            System.out.print("Hasilnya = ");
            total = bil1 - bil2;
            break;
            case 3:
            System.out.println( + bil1 + " x " + bil2 );
            System.out.print("Hasilnya = ");
            total = bil1 * bil2;
            break;
            case 4:
            System.out.println( + bil1 + " : " + bil2 );
            System.out.print("Hasilnya = ");
            total = bil1 / bil2;
            break;
            default:
            System.out.println("Anda harus mengisi angka");
            
        }
        System.out.println(total);
        
    }
    }
   
}
