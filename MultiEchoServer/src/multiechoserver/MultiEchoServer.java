
package multiechoserver;
import java.io.*;
import java.net.*;
public class MultiEchoServer {
    private static ServerSocket servSock;
    private static final int PORT = 12345;
    
    public static void main(String[] args) throws IOException{
        System.out.println("Opening Port....\n");
        try {
            servSock = new ServerSocket(PORT);
          
        } catch (Exception e) {
            System.out.println("Unable to attach to port");
            System.exit(1);
        }
        do {            
            Socket client = servSock.accept();
            ClientHander handler = new ClientHander(client);
            handler.start();
        } while (true);
    }
    
}

class ClientHander extends Thread{
    private Socket client;
    private BufferedReader in;
    private PrintWriter out;
    
    public ClientHander(Socket socket){
        client = socket;
        
        try {
            in = new BufferedReader (
            new InputStreamReader(client.getInputStream())
            );
            out = new PrintWriter(client.getOutputStream(),true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/* Wawan Chahyo Nugroho NIM:12131294 */
        public void run(){         
            try{
                String received, balik=""; //tambahkan variabel balik untuk manampung pembalikan
                Integer no=0; //variabel no. untuk identifikasi pesan dari client
                do{
                    received = in.readLine();                    
                    no++; //penambahan nilai no. seiring berjalannya looping
                    
                    /*Perulangan yang digunakan untuk membalik pesan client
                    dengan memanfaatkan length string untuk mengambil ekor stringnya*/
                    int panjang = received.length();
                    for (int i= panjang-1; i >= 0; i--){
                        balik = balik+received.charAt(i);
                    }                                        
                    System.out.println("Message received #no:" + no +" "+ received); //menampilkan pesan client beserta no.nya
                    out.println("SERVER Message #no:" + no +" "+ balik); //menampilkan respon server yang sudah dibalik dan beserta no.pesannya.
                    balik="";
                }while(!received.equals("QUIT"));
            }catch(IOException e){
                e.printStackTrace();
            }
            finally{
                try{
                    if (client != null){
                        System.out.println("Closing down connection");
                        client.close();
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
}