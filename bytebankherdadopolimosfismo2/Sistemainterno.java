
public class Sistemainterno {

	private int senha = 4321;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Senha correta !!!");
		}else {
			System.out.println("Senha incorreta !!!");
		}
	}
	
}
