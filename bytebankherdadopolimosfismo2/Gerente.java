//Classe Gerente � um funcionario e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
		
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	//Funciona somente com a declara��o protected
	//public double getBonificacao() {
		//return super.getBonificacao() + super.salario;
	//}
	
	//Funciona somente com a declara��o private
	public double getBonificacao() {
		System.out.println("M�todo Bonifica��o Gerente");
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