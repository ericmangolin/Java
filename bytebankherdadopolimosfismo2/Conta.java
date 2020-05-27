//Classe com atributos = caracteristicas
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	//Conceito de variavel global da classe e nao do objeto
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		if(total > 1) {
		System.out.println("Ha "+ Conta.total + " contas abertas");
		}else {
			System.out.println("Ha "+ total + " conta aberta");
		}
		//Inicializar, popular os atributos
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Conta: " + this.numero);
	}
	
	// Nos mÃ©todos, dentro dos () inserimos argumentos
	private void deposita(double valor) {
		// This = usado para atributos e nÃƒÂ£o variÃ¡veis
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			
			destino.deposita(valor);
			return true;
		}
		return false;
	}
//Captura o saldo 'desta' conta (this)
	public double getSaldo() {
		return this.saldo;
	}
	
//COM CONSTRUTORES NÃƒO DISPENSÃ�VEL O GET E SET
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Conta nao pode ser negativo!");
			System.out.println("Favor digitar uma valor valido");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Agencia nao pode ser negativo!");
			System.out.println("Favor digitar uma valor valido");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}
