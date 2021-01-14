
package com.gatewan.client;
/*
Wawan Chahyo Nugroho
NIM.12131294
Detail tentang program ini ada di:
http://www.gatewan.com/2017/03/belajar-pemrograman-socket.html
*/
import java.io.*;
import java.net.*;
public class ComGatewanClient {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Socket client = null; //deklarasi objek socket dengan nama client
        InputStream in = null; //deklarasi objek InputStream dengan nama in
        OutputStream out = null; //deklarasi objek OutputStream dengan nama out
        
        byte[] receiveMessage = new byte [64];
        try {
            client = new Socket ("localhost",8881); /*untuk membuat sebuah stream socket dan juga koneksi ke
            suatu port tertentu pada sebuah komputer berdasar namanya.
            Formatnya adalah --> Socket(String host, int port)
            */
            in=client.getInputStream(); //mengisi objek in dengan input dari client
            out=client.getOutputStream(); 
        } catch (IOException e) {
            System.out.println(e.getMessage());System.exit(-1);
        }
        /*try..catch adalah statement pada java yang digunakan untuk menangani pesan error, 
        dan dapat melanjutkan jalannya program tanpa harus berhenti karena error. 
        Error yang ditangani try..catch bisa disebut dengan exeption.*/
    
    String fromServer;
    String fromUser;
    in.read(receiveMessage);
        fromServer = new String(receiveMessage);
        System.out.println("Server:"+fromServer);
        fromUser = "Salam dari Client";
        System.out.println("Kirim ke server :"+fromUser);
        out.write(fromUser.getBytes());
        fromUser = "Ini data dari Client";
        System.out.println("Kirim ke server :"+fromUser);
        out.write(fromUser.getBytes());
        fromUser = "Keluar";
        System.out.println("Kirim ke server :"+fromUser);
        out.write(fromUser.getBytes());
        out.close();in.close();client.close();
   }
}
