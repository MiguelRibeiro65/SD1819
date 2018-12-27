
public class Utilizador {

	private String mail;
	private String password;
	
	public Utilizador() {
		this.mail = null;
		this.password = null;
	}
	
	public Utilizador(String mail, String password) {
		this.mail = mail;
		this.password = password;
	}
	
	public Utilizador(Utilizador u) {
		this.mail = u.getMail();
		this.password = u.getPassword();
	}
	
	public String getMail() {
		return this.mail;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
