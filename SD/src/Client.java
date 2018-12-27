import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		try{
			Socket socket = new Socket("localhost", 1234);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			Menu menu = new Menu();
			menu.setOpcao(1);
			
			
			ClientOutput co = new ClientOutput(menu);
			ClientInput ci 	= new ClientInput(menu);
			
			co.start();
			ci.start();
			
			
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
