
public class ContaCorrente extends Conta {

	
	public ContaCorrente(int agencia, int numero) {
		//Construtor da classe mae:
		super(agencia, numero);
	}
	
	//C�digo reaproveitado 
	@Override //Anota��o, c�digo sobrescrito
	//Qdo reaproveitado o M�todo deve ter as mesmas caracter�sticas: public, boolean, etc
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		// TODO Auto-generated method stub
		return super.saca(valorASacar);
	}
	
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
