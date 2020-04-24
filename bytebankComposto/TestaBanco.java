
public class TestaBanco {
	public static void main(String[] args) {
		Cliente eric = new Cliente();
		eric.nome = "Eric Mangolim";
		eric.cpf = "917.333.401-49";
		eric.profissao = "Programador";
		
		Conta contaEric = new Conta();
		contaEric.deposita(100);
		
		//Associação, Composição do cliente com a conta
		contaEric.titular = eric;
		
		//O elemento '.' é o navegador entre os dados
		System.out.println(contaEric.titular.nome);
		
		//endereço do objeto:
		System.out.println(contaEric.titular);
		System.out.println(eric);
	}
}
