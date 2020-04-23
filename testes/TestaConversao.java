
public class TestaConversao {
	public static void main(String[]args) {
		double salario = 1275.50;
		//Promove uma variável para outro tipo
		int valor = (int)salario;
		System.out.println(valor);
		//Outras Variáveis: Long, short, byte, float
		//Problemas Matemáticos
		double a = 0.1;
		double b = 0.2;
		System.out.println(a + b);
		//Resultado: 0.30000000000000004
	}
}
