
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Eric A. Mangolim");
		g.setSalario(30000.00);
		
		Funcionario f = new Funcionario();
		f.setNome("Andr� Mangolim");
		f.setSalario(25000.00);
		
		EditorVideo e = new EditorVideo();
		f.setNome("Mangolim");
		f.setSalario(20000.00);
		
		Design d = new Design();
		f.setNome("Piloneto");
		f.setSalario(10000.00);
		
		ControleBonifacao controle = new ControleBonifacao();
		controle.registra(g);
		controle.registra(f);
		controle.registra(e);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
		//Esta linha n�o compila, pois o m�todo est� em 'Gerente' e n�o 'Funcion�rio'
		//g1.autentica(1234);
		
	}

}
