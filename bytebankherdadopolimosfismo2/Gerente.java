//Classe Gerente é um funcionario e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
		
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	//Funciona somente com a declaração protected
	//public double getBonificacao() {
		//return super.getBonificacao() + super.salario;
	//}
	
	//Funciona somente com a declaração private
	public double getBonificacao() {
		System.out.println("Método Bonificação Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}