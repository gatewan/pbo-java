
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaHTTPGet {
    public static void main(String[] args) {
        try{
            System.out.println("Connecting....");
            String url="http://localhost/tesnama.php";
            URL obj= new URL(url);
            HttpURLConnection con = 
                    (HttpURLConnection) obj.openConnection();
            System.out.println("Server Response");
            System.out.println("Response Code: "
                    +con.getResponseCode());            
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String line;
            System.out.println("Data Response");
            while ((line=in.readLine())!=null)System.out.println(line);
            in.close();
            con.disconnect();
        }catch(UnknownHostException e){
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
}
}
