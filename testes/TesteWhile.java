
public class TesteWhile {
	public static void main(String[] args) {

		// Variável de escopo geral
		int contador = 0;
		while (contador <= 10) {
			System.out.println(contador);
			contador = contador + 1;

			// Resumo de contador:
			// contador = contador + 1
			// contador += 1 ou
			// Mais usado contador++ ou ++contador
		}
		// System.out.println(contador);
	}
}
