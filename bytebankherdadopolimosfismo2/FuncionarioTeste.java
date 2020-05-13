public class FuncionarioTeste {
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; //0 - Funcionário comum; 1 - Gerente; etc
	private int senha;
	
	
	public double getBonificacao() {
		if(this.tipo == 0) {
			System.out.print("Funcion Comum: ");
			return this.salario;
		}else if(this.tipo == 1) {
			System.out.print("Func. Gerente: ");
			return this.salario;
		}else {
			System.out.print("Func. Diretor: ");
			return this.salario + 1000.0;
		}
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
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
