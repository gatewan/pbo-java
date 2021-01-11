package gatewan;

public class StringTest {
    public static void main(String[] args) {
        String str = new String("stmik El rahma");
        String str2 = "stmik el rahma";
        
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(7));//untuk mengambil karakter ke-n
        System.out.println(str.substring(8));//untuk menampilkan karakter dimulai dari ke-n sampai akhir
        //dan penghitungan dimulai dari 0,1,2... dst
        System.out.println(str.substring(3, 8));//untuk menampilkan karakter dimulai dari ke-n sampai ke-n
        System.out.println(str.indexOf("E"));//case sensitive
        
        //split digunakan untuk menyisipkan dan kebetulan yang disisipkan adlah
        //spasi, karena split adalah tipe string array maka cara menampilkannya
        //harus menggunakan perulangan
        String array[] = str.split(" ");
        for (String string : array) {
            System.out.println(string);
        }
        
        // str == str2 --> khusus di java, untuk cara membandingkan string itu
        // tidak berlaku sebagaimana contoh diatas, akan tetapi harus menggunakan
        // equals (case sensitive) atau equalsIgnoreCase(not case sensitive) 
        System.out.println(str2.equals(str));
        System.out.println(str2.equalsIgnoreCase(str));
        
        System.out.println(str.length());
        System.out.println(str.concat(str2)); //str + str2

    }
    
}
