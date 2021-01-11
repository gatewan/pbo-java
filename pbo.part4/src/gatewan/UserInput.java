package gatewan;

import java.util.Scanner;

public class UserInput {
   
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Siapa namamu ? ");
        String namaSaya = input.nextLine();
    
        System.out.print("Berapa usiamu ? ");
        int usiaSaya = 0;
        //validasi input
        if (input.hasNextInt()) {
            usiaSaya = input.nextInt();        
        }
            else {
                  System.out.println("Anda harus mengisi angka");
                    }
             
        System.out.println(" Namamu Adalah " + namaSaya);
        System.out.println(" Usiamu Adalah " + usiaSaya + " tahun");
    }
                
}
