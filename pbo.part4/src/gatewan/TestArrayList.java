
package gatewan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayList {

    public static void main(String[] args) {
       List<String> listStr = new ArrayList<String>();
       
       Scanner input = new Scanner(System.in);
       String str = input.nextLine();
       
       listStr.add(str);
       listStr.add("Ahmad");
       listStr.add("gogo");
       listStr.add("tita");
       listStr.add(2, "mumu");
       
       listStr.remove(2);
       
       //pernyataan "size" jika di dalam c++ adalah length
       for(int i = 0; i < listStr.size(); i++){ 
           System.out.println(listStr.get(i));
       }
               
    }
    
}
