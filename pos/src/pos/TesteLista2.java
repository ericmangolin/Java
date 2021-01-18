package pos;

import java.util.ArrayList;
import java.util.List;

public class TesteLista2 {
	public static void main(String[] args) {

		ArrayList lista = new ArrayList();

		lista.add("Estrutura");
		lista.add("de");
		lista.add("Dados");
		lista.add("Orientada");
		lista.add("a");
		lista.add("Objetos");

		System.out.println("Tamanho = " + lista.size());
		System.out.println("toString() => " + lista.toString());

		for (int x = 0; x < lista.size(); x++) {
			System.out.println("lista [" + x + "] = " + lista.get(x));
		}
		System.out.println("Posição de = " + lista.indexOf("Dados"));
		System.out.println("Posição de = " + lista.indexOf("Dados"));
		List lista2 = lista.subList(0, 3);
		System.out.println("lista2.toString() => " + lista2.toString());
	}
}
