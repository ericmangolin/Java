public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
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
	
}
