public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		
		System.out.println("Chama Bonifica��o Editor de V�deo");
		return super.getBonificacao() + 100;
	}
	
}
