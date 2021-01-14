
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;


public class JavaHTTP {
    public static void main(String[] args) {
        try{
            System.out.println("Connecting...");
            String url = "http://localhost/testnama.php";
            URL obj = new URL(url);
            HttpURLConnection con =(HttpURLConnection) obj.openConnection();
            System.out.println("Server Respon");
            System.out.println("Respon Code :"+con.getResponseCode());            
            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String line;      System.out.println("Data Respon:");
            while((line=rd.readLine())!=null) System.out.println(line);
            rd.close();con.disconnect();
        }catch(UnknownHostException e){
            System.err.println(e.getMessage());System.exit(1);
        }catch(IOException e){
            System.err.println(e.getMessage());System.exit(1);
        }
    }
}
