
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1779, 13522);
		
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		//Brecha erro, inconsist�ncia, retorna zero
		//System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1778, 15000);
		Conta conta3 = new Conta(1777, 14000);
		
		//Vari�vel Global
		System.out.println(Conta.getTotal());
	}

}
