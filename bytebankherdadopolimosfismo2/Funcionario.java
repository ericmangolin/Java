//N�o permite instanciar/criar objetos desta classe, pois ela � 'Abstrata'
//Permite utilizar heran�a ~dos demais m�todos. Ex.: getBonificacao, etc
public abstract class Funcionario {
	private String nome;
	private String cpf;
	//protected double salario;
	private double salario;
	
	//CONSTRUTOR vazio
	//public Funcionario() {
		
	//}
	
	//M�todo sem corpo, n�o h� implementa��o. A implementa��o ocorre nos filhos
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
