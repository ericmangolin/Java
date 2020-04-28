package bytebankencapsulado;
//Classe com atributos = características
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private cliente titular;

	// Nos métodos, dentro dos () inserimos argumentos
	void deposita(double valor) {
		// This = usado para atributos e não variáveis
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
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// destino.saldo += valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
//Captura o saldo 'desta' conta (this)
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}
