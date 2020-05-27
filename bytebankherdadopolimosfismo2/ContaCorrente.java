
public class ContaCorrente extends Conta {

	
	public ContaCorrente(int agencia, int numero) {
		//Construtor da classe mae:
		super(agencia, numero);
	}
	
	//Código reaproveitado 
	@Override //Anotação, código sobrescrito
	//Qdo reaproveitado o Método deve ter as mesmas características: public, boolean, etc
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		// TODO Auto-generated method stub
		return super.saca(valorASacar);
	}
	
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
