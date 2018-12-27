import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

public class Main {
	
	private Map<String, Utilizador> utilizadores; //= new Map<String, Utilizador>();
	private Lock lockUtilizadores;

	public Main() {
		this.utilizadores = new HashMap<String, Utilizador>();
		povoamento();
		
	}
	
	public Utilizador login(String username, String password) throws Exception {
		Utilizador preLog = null;
		this.lockUtilizadores.lock();
		try {
			//se utilizador existe
			if(utilizadores.containsKey(username)) {
				preLog = utilizadores.get(username);
				//se a password é a correta
				if(utilizadores.get(username).getPassword().equals(password)) {
					preLog = utilizadores.get(username);
					System.out.println("Utilizador Válido");
				} else {
					throw new Exception("Password Errada");
				}
			} else {
				throw new Exception("Conta não existe");
			}
		} finally {
			this.lockUtilizadores.unlock();
		}
		this.lockUtilizadores.lock();
		try {
			return preLog;
		} finally {
			this.lockUtilizadores.unlock();
		}
		
	}
	
	public void registar(String username, String password) throws Exception {
		Utilizador u;
		this.lockUtilizadores.lock();
		try {
			//caso o utilizador já exista
			if(utilizadores.containsKey(username)) throw new Exception("Utilizador já existe");
			else {
				u = new Utilizador(username, password);
				utilizadores.put(u.getMail(), u);
				System.out.println("Conta adicionada com sucesso");
			}
		} finally {
			this.lockUtilizadores.unlock();
		}
	
	}
	//povoamento do hashmap de utilizadores
	public void povoamento() {
		Utilizador u1 = new Utilizador("u1", "u1");
		Utilizador u2 = new Utilizador("u2", "u2");
		Utilizador u3 = new Utilizador("u3", "u3");
		utilizadores.put(u1.getMail(), u1);
		utilizadores.put(u2.getMail(), u2);
		utilizadores.put(u3.getMail(), u3);
	}
	
	


}
