
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("TESTANDO CONDICIONAIS:");
		System.out.println();
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Vc tem mais de 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Vc n�o tem 18 anos, mas pode entrar, pois est� acompanhado");
			} else {
				System.out.println("Infelizmente vc n�o pode entrar !");
			}
		}
	}
}
