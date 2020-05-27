
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 4567);
		//Métodos reaproveitados - herança
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(321, 7654);
		//Métodos reaproveitados - herança
		cp.deposita(200.0);
		
		//Métodos reaproveitados - herança
		cc.transfere(50.0, cp);
		
		System.out.println("Saldo da CC é: " + cc.getSaldo());
		System.out.println("Saldo da CP é: " + cp.getSaldo());
	}
}
