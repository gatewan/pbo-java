import java.io.*;
import java.net.*;
public class HttpGet {
    public static void main(String[] args)throws IOException {
        Socket s = new Socket("localhost", 80);
        PrintWriter wtr = new PrintWriter(s.getOutputStream());
        wtr.write("POST /tesnama.php HTTP/1.1\r\n");
        wtr.write("Host: localhost\r\n");
        wtr.write("\r\n");
        wtr.flush();
        BufferedReader bufRead = new BufferedReader
        (new InputStreamReader(s.getInputStream()));
        String outStr;
        while((outStr = bufRead.readLine()) != null){
            System.out.println(outStr);
        }
        bufRead.close();wtr.close();
    }
}
