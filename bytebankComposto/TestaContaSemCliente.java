public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaEric = new Conta();
		System.out.println(contaEric.saldo);
		
		contaEric.titular = new cliente();
		System.out.println(contaEric.titular);
		
		contaEric.titular.nome = "Eric Andre";
		System.out.println(contaEric.titular.nome);
	}
}
