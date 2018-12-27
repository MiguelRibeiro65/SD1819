
public class Menu {

	private int opcao = 0;
	
	public void doMenu() {
		switch (opcao) {
			case 1 : 
				System.out.println(
						"#############################\n" + 
						"#############MENU############\n" +
						"                             \n" +
						"-> 1 - LOGIN                 \n" +
						"-> 2 - REGISTAR              \n" +
						"-> 3 - SAIR                  \n" +
						"                             \n" +
						"#############################\n" +
						"#############################\n"
						);
			
		}
	}
	
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	
	public int getOpcao() {
		return this.opcao;
	}
	
}
