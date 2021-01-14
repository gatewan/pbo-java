
package com.gatewan.server;
/*
Wawan Chahyo Nugroho
NIM.12131294
Detail tentang program ini ada di:
http://www.gatewan.com/2017/03/belajar-pemrograman-socket.html
*/
import java.io.*;
import java.net.*;
public class ComGatewanServer {
 
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        ServerSocket server = null;
        Socket client = null;
        
        byte[] receiveBuf = new byte[64];
        int receiveMesssageSize;
        try {
            server = new ServerSocket(8881);
            System.out.println("Server Started");
            client = server.accept();
            System.out.println("Client terkoneksi");
            
        } catch (IOException e) {
            System.out.println(e.getMessage()); System.exit(-1);
        }
        InputStream in = client.getInputStream();
        OutputStream out = client.getOutputStream();
        String data;
        data = "Salam dari server";
        out.write(data.getBytes());
        java.util.Arrays.fill(receiveBuf, (byte)0);
        
        while(true){
            receiveMesssageSize = in.read(receiveBuf);
            data = new String (receiveBuf);
            if(data.trim().equals("Keluar")){
                out.write(data.getBytes());break;
            }
            java.util.Arrays.fill(receiveBuf, (byte)0);
            System.out.println("Client : "+data);
        }
        out.close();in.close();client.close();server.close();
    } 
}
