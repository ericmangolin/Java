
public class TesteCaracteres {
	public static void main(String[]args) {
		char letra = 'a';
		System.out.println(letra);
		
		//Quando utiliza valores retorna caracteres da tabela ASC
		char valor = 66;
		System.out.println(valor);
		
		valor = (char)(valor + 1);
		System.out.println(valor);
		
		String palavra = "Formação em Java";
		System.out.println(palavra);
		
		palavra = palavra +" "+ 2020;
		System.out.println(palavra);
	}
}
