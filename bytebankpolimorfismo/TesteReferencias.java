
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Eric A. Mangolim");
		g.setSalario(30000.00);
		
		Funcionario f = new Funcionario();
		f.setNome("Andr� Mangolim");
		f.setSalario(25000.00);
		
		ControleBonifacao controle = new ControleBonifacao();
		controle.registra(g);
		controle.registra(f);
		
		System.out.println(controle.getSoma());
		
		//Esta linha n�o compila, pois o m�todo est� em 'Gerente' e n�o 'Funcion�rio'
		//g1.autentica(1234);
		
	}

}
