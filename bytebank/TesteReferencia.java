
public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("A conta 1 tem: " + primeiraConta.saldo);
		
		//Cria uma referencia para o ID do dado na memoria
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo += 100;
		System.out.println("A conta 2 tem: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Contas Iguais");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
