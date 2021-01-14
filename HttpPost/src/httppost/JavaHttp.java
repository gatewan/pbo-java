
package httppost;

public class JavaHttp {
    public static void main(String[] args){
        try {
            System.out.println("Connecting...");
            String url = "http://localhost/testname.php";
            URL obj = new URL(url);
            HttpURIConnection con = (HttpURIConection) obj.openConnection();
            System.out.println("Sever Response");
            System.out.println("Response Code :"+con.getResponseCode());
            
            BufferedReader rd = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
            String line;
            System.out.println("Data Respon");
            while{(line)
        } catch (Exception e) {
        }
    }
}
