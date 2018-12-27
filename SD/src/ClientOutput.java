import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientOutput extends Thread {
	
	private Menu menu;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	private Socket socket;
	
	public ClientOutput(Menu menu) throws IOException {
		this.menu = new Menu();
		this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		this.printWriter = new PrintWriter(socket.getOutputStream(), true);
	}
	
	public void run() {
		
		String input;
		menu.doMenu();
		try {
			while((input = bufferedReader.readLine()) != null) {
				if(menu.getOpcao() == 1) {
					if(input.equals("1")) {
						printWriter.println("login");
						System.out.println("Username: \n");
						input = bufferedReader.readLine();
						
					}
				}
			
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
