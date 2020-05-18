public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		
		System.out.println("Chama Bonificação Editor de Vídeo");
		return super.getBonificacao() + 100;
	}
	
}
