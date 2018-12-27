import java.io.BufferedReader;
import java.io.IOException;

public class ClientOutput extends Thread {
	
	private Menu menu;
	private BufferedReader br;
	
	public ClientOutput(Menu menu) {
		this.menu = new Menu();
	}
	
	public void run() {
		
		menu.doMenu();
		//String linha = br.readLine();
		/*try {
			while(linha != null) {
				if(menu.getOpcao() == 1) {
					if()
				}
			
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
	}
}
