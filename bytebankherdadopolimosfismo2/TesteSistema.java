
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(1234);
		
		Administrador adm = new Administrador();
		adm.setSenha(4321);
		
		ClienteNovo c = new ClienteNovo();
		c.setSenha(1111);

		//Não está no escopo do funcionario Autenticavel
		//Design d = new Design();
		//d.setSenha(1111);
		
		Sistemainterno si = new Sistemainterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(c);
	}
}
