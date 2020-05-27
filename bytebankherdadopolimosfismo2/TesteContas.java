
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 4567);
		//M�todos reaproveitados - heran�a
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(321, 7654);
		//M�todos reaproveitados - heran�a
		cp.deposita(200.0);
		
		//M�todos reaproveitados - heran�a
		cc.transfere(50.0, cp);
		
		System.out.println("Saldo da CC �: " + cc.getSaldo());
		System.out.println("Saldo da CP �: " + cp.getSaldo());
	}
}
