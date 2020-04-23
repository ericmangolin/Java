
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraconta = new Conta();
		primeiraconta.saldo = 200;
		//System.out.println(primeiraconta.saldo);
		primeiraconta.saldo += 100;
		//System.out.println(primeiraconta.saldo);
		
		//Cria uma referencia à "Conta"
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A Conta 1 tem: " + primeiraconta.saldo);
		System.out.println("A Conta 2 tem: " + segundaConta.saldo);
		
		//Valor padrão das variáveias do objeto
		segundaConta.agencia = 1785;
		System.out.println("Agencia conta 1: " + primeiraconta.agencia);
		System.out.println("Agencia conta 2: " +segundaConta.agencia);
		
		//Não compara o objeto
		//Para comparar o valor deve apontar o atributo. Ex: PrimeiraConta.saldo
		if(primeiraconta == segundaConta) {
			System.out.println("Contas Iguais");
		}else {
			System.out.println("Contas diferentes");
		}
		System.out.println(primeiraconta);
		System.out.println(segundaConta);
	}

}
