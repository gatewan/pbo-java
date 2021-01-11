package gatewan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inputMahsiswa {

    public static void main(String[] args) {
        List<String> listNim = new ArrayList<String>();
        List<String> listNama = new ArrayList<String>();
        Scanner input = new Scanner (System.in);
        char jawaban = 'y';
     
      do{
      System.out.println("Entri data mahasiswa");
      System.out.print("NIM   : ");
      String nim = input.nextLine();
      listNim.add(nim);
      
      System.out.print("Nama    : ");
      String nama = input.nextLine();
      listNama.add(nama);
      
      System.out.println("Entri data lagi (Y/N) ?");
      jawaban = input.nextLine().charAt(0);
      }
      
      while (jawaban =='y' || jawaban == 'Y');
      
      System.out.println("Jumlah mahsiswa: " + listNim.size());
     
     //System.out.println("Entri data mahasiswa");
    
    
    }
}
