//Classe com atributos = caracter�sticas
public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	//Nos m�todos, dentro dos () inserimos argumentos
	void deposita(double valor) {
		//This = usado para atributos e n�o vari�veis
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			//destino.saldo += valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}