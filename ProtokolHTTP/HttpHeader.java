
import java.io.*;import java.net.*;
public class HttpHeader {
    public static void main(String[] args)throws IOException {
        Socket s = new Socket("localhost", 80);
        PrintWriter wtr = new PrintWriter(s.getOutputStream());
        wtr.println("GET /test.php HTTP/1.1");
        wtr.println("Host: localhost");
        wtr.println(""); wtr.flush();
        BufferedReader bufRead = new BufferedReader
                (new InputStreamReader(s.getInputStream()));
        String outStr;
        while((outStr = bufRead.readLine()) != null){
            System.out.println(outStr);
        }
        bufRead.close();wtr.close();
    }
}
