package bytebankencapsulado;

public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		//Não compila
		//conta.numero = 1337
		
		//Correto: Invocação de método
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		cliente Eric = new cliente();
		//conta.titular = Eric
		
		conta.setTitular(Eric);
		//pedindo alteração dos dados do Titular através de método 
		Eric.setNome("Eric Mangolim"); 
		
		conta.setTitular(Eric);
		
		//É necessário chamar os gets que apontam para o atributo
		System.out.println(conta.getTitular().getNome());
		
		//Alterar o titular da conta
		conta.getTitular().setProfissao("Programador");
		//Agora em duas linhas, outra versão, com variável temporária
		cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
		//Entendendo a referencia: São as as mesmas referencias
		System.out.println(titularDaConta);
		System.out.println(Eric);
		System.out.println(conta.getTitular());
	}
}
