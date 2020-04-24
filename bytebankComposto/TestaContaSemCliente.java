
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaEric = new Conta();
		System.out.println(contaEric.saldo);

		contaEric.titular.nome = "Eric Andre";
		System.out.println(contaEric.titular.nome);
	}
}
