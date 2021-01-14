import java.io.*;
import java.net.*;
public class SimpleHTTPPost {
    public static void main(String[] args) {
        try{
            String data = "nim=1235&nama=Yuli&nilai=95";
            String host = "localhost";
            int port = 80;
            Socket socket = new Socket(host, port);            
            System.out.println("Kirim Header");
            String path="/tesnama.php";
            BufferedWriter wr = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()
                            ,"UTF8"));
            wr.write("POST "+path+" HTTP/1.1\r\n");
            wr.write("HOST:"+host+" \r\n");
            wr.write("Content-Length: "+data.length()+"\r\n");
            wr.write("Content-Type: application/x-www-form-urlencoded\r\n");
            wr.write("\r\n");
            System.out.println("Kirim Data");
            wr.write(data);wr.flush();            
            System.out.println("Hasil Response");
            BufferedReader rd = new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));
            String line ;
       while ((line=rd.readLine())!=null){System.out.println(line);}
            wr.close();rd.close();
          }catch(UnknownHostException e){
           System.err.println(e.getMessage());System.exit(1);
          }catch(IOException e){
           System.err.println(e.getMessage());System.exit(1);
          }}
}