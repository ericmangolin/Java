//Classe Gerente é um funcionario e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
		
	private int senha;
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