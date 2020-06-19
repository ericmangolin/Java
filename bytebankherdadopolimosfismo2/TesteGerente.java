
public class TesteGerente {

	public static void main(String[] args) {
		
		//É possivel declarar os contratos que a var utiliza
		//Pode-se usar todos os objetos que utilizam o mesmo contrato
		//Ex. new Administrador, Gerente, Cliente
		Autenticavel g2 = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Éric André Mangolim");
		g1.setCpf("917.333.401-49");
		g1.setSalario(30000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
