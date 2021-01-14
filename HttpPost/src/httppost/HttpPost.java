package httppost;

public class HttpPost {

    public static void main(String[] args) throws IOExeption {
       Socket s = new Socket("localhost", 80);
       PrintWriter wtr = new PrintWriter(s.getOutputStream());
       String data = "nim=12131294&nama=Wawan&nilai=92";
       wtr.write("POST /testnama.php HTTP/1.1\r\n");
       wtr.write("Host: localhost\r\n");
       wtr.write("Content-length")
    }
    
}
