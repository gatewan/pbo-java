/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriPBO;

import java.util.Scanner;

/**
 *
 * @author gatewan.com
 */
public class tipedata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
		// 2 kategori tipe data
		// 1 tipe data primitif (biasanya ditulis dengan diawali huruf kecil smua)
		// 2 tipe data referensi/objek (biasanya ditulis dengan diawali huruf besar semua)
		int intNum = Integer.MAX_VALUE;
		long longNum = Long.MAX_VALUE;//khusus untuk long jika di isi dengan nilai maka terakhir harus ditandai dengan l/L, 
		//sebab jika tidak akan dianggap sebagai integer, contoh 12134232131L;
		short shortNum = Short.MAX_VALUE;
		byte byteNum = Byte.MAX_VALUE;
		//semua tipe data diatas hanya untuk angka bulat
		//jika ingin melihat berapa batas jangkauan minimum tipe data diatas bisa dengan cara mengganti MAX dengan MIN
		System.out.println(intNum);
		System.out.println(longNum);
		System.out.println(shortNum);
		System.out.println(byteNum);
		
		//dibawah ini merupakan tipe data pecahan
		float floatNum = Float.MAX_VALUE; //untuk float harus ditandai dengan huruf f/F, sebab jika tidak akan dianggap sebagai double.
		double doubleNum = Double.MAX_VALUE;
		System.out.println(floatNum);
		System.out.println(doubleNum);
		
		//sementara dibawah ini merupakan tipe data char, (character), cara penulisannya adalah dengan diapit tanda petik 1 ('')
		//sedangkan untuk tanda petik 2 {"") digunakan untuk text,
		char karakter1 = 76;
		char karakter2 = 'A';
		System.out.println(karakter1);
		System.out.println(karakter2);
		
		//dibawah ini merupakan tipe data boolean yang terdiri dari true dan false, tidak seperti c++ dalam java boolean tidak bisa diganti dg 0/1.
		boolean boolValue = false;
		System.out.println(boolValue);
		
		//TIPE DATA REFERENSI
		// nama-class nama-variabel = new konstruktor
		Integer intObj = new Integer(12000);
		String str = new String("STMIK EL RAHMA"); //keistimewaan tipe data ini bisa menggunakan deklarasi seperti ini :
		String srt = "STMIK EL RAHMA"; //sedangkan tipe data yang lain harus sesuai dengan prosedur;
		System.out.println(intObj);
		System.out.println(str);
		System.out.println(srt);
		
		//KONSTANTA
		// final tipe-data NAMA-KONSTANTA = nilai;
		final int MAX_VALUE = 10; //MAX_VALUE ini berbeda dengan diatas tadi, ini sekarang bersifat independent
		//untuk nama konstanta harus menggunakan huruf KAPITAL SEMUA dan jika lebih dari 1 suku kata mk dipisah dengan tanda("_")
		for (int i = 0; i < MAX_VALUE; i++) {
			System.out.println(i);
		}
		
		
		//UserInput
		//ketik scann - CTRL+SPACE
		 
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
