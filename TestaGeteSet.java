package bytebankencapsulado;

public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		//N�o compila
		//conta.numero = 1337
		
		//Correto: Invoca��o de m�todo
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
	}
}
