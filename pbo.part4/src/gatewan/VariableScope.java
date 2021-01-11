
package gatewan;

public class VariableScope {
static int classVar = 70;
	
    public static void main(String[] args) {
    int localVar = 100; // local
    
    System.out.println(localVar);
    System.out.println(classVar); //atau global var
    
        {
		int blockVar = 80; // hanya dikenali dlm block
		System.out.println(blockVar);
        }
        System.out.println(localVar);
	//blockVar tidak akan dikenali sebab berada di luar jangkauan..
	//System.out.println(blockVar);
        
        tampil();
    }
    
    static void tampil() {
        System.out.println(classVar);
        //System.out.println(localVar);
    }
    
    
}
