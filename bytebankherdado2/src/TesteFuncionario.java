
public class TesteFuncionario {

	public static void main(String[] args) {
		//Referencia criada e inicializada
		Funcionario eric = new Funcionario();
		eric.setNome("Eric Mangolim");
		eric.setCpf("917.333.401-49");
		eric.setSalario(30.000);
		
		System.out.println(eric.getNome());
		System.out.println(eric.getCpf());
		System.out.println(eric.getSalario());
		System.out.println(eric.getBonificacao());
	}
}
