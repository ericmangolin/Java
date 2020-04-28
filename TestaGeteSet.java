package bytebankencapsulado;

public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		//Não compila
		//conta.numero = 1337
		
		//Correto: Invocação de método
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
	}
}
