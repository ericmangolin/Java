
public class Sistemainterno {

	private int senha = 1234;
	
	public void autentica(Gerente g) {
		boolean autenticou = g.autentica(this.senha);
		if(autenticou) {
			System.out.println("Senha correta !!!");
		}else {
			System.out.println("Senha incorreta correta !!!");
		}
	}
	
}
