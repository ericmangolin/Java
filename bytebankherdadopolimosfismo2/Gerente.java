//Classe Gerente � um funcionario e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
		
	private int senha;
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
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
		return false;
		}
	}
	
}