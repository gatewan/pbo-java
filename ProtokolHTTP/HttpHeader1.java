import java.io.*;
import java.net.*;

public class HttpHeader1 {
    public static void main(String[] args)throws IOException {
        Socket client = null;
        InputStream in = null;
        OutputStream out = null;
        
        byte[] receiveMessage = new byte[64];
        try{
            client = new Socket("localhost",80);
            in=client.getInputStream();
            out=client.getOutputStream();
        }catch(IOException e){
            System.out.println(e.getMessage());System.exit(-1);
        }                              
        String fromServer;
        String fromUser;
        fromUser = "GET /test.php HTTP/1.1\r\nHost: localhost\r\n\r\n";
        out.write(fromUser.getBytes());        
        
        in.read(receiveMessage);
        fromServer=new String(receiveMessage);
        System.out.println("Server:"+fromServer);
        in.read(receiveMessage);
        fromServer=new String(receiveMessage);
        System.out.println("Server:"+fromServer);
        in.read(receiveMessage);
        fromServer=new String(receiveMessage);
        System.out.println("Server:"+fromServer);
        in.read(receiveMessage);
        fromServer=new String(receiveMessage);
        System.out.println("Server:"+fromServer);
        //print result       
        out.close();in.close();client.close();  
    }
}