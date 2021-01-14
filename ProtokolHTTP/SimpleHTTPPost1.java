package simpannilai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleHTTPPost1 {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 80);
        PrintWriter wtr = new PrintWriter(s.getOutputStream());
        String data = "nim=12141400&nama=Aris&nilai=70";
//        System.out.println(data.length());
        wtr.write("POST /progjar/proses_simpan.php HTTP/1.1 \r\n");
        wtr.write("Host: localhost \r\n");
        wtr.write("Content-Length:31 \r\n");
        wtr.write("Content-Type:application/x-www-form-urlencoded \r\n");
        wtr.write("\r\n");
        wtr.write(data);
        wtr.flush();
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String outStr;
        while ((outStr = bufRead.readLine())!= null){
            System.out.println(outStr);
        }
        bufRead.close();
        wtr.close();
    }
    
}
