//Não permite instanciar/criar objetos desta classe, pois ela é 'Abstrata'
//Permite utilizar herança ~dos demais métodos. Ex.: getBonificacao, etc
public abstract class Funcionario {
	private String nome;
	private String cpf;
	//protected double salario;
	private double salario;
	
	//CONSTRUTOR vazio
	//public Funcionario() {
		
	//}
	
	//Método sem corpo, não há implementação. A implementação ocorre nos filhos
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
