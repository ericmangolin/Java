package bytebankencapsulado;

public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		//N�o compila
		//conta.numero = 1337
		
		//Correto: Invoca��o de m�todo
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		cliente Eric = new cliente();
		//conta.titular = Eric
		
		conta.setTitular(Eric);
		//pedindo altera��o dos dados do Titular atrav�s de m�todo 
		Eric.setNome("Eric Mangolim"); 
		
		conta.setTitular(Eric);
		
		//� necess�rio chamar os gets que apontam para o atributo
		System.out.println(conta.getTitular().getNome());
		
		//Alterar o titular da conta
		conta.getTitular().setProfissao("Programador");
		//Agora em duas linhas, outra vers�o, com vari�vel tempor�ria
		cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
		//Entendendo a referencia: S�o as as mesmas referencias
		System.out.println(titularDaConta);
		System.out.println(Eric);
		System.out.println(conta.getTitular());
	}
}
