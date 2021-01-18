package pos;

import java.util.ArrayList;

public class TesteLista {
	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		System.out.println("Vazia = " + lista.isEmpty());
		System.out.println("Tamanho = " + lista.size());
		
		lista.add(2);
		lista.add(2);
		lista.add(2.5f);
		lista.add("Teste ArrayList");
		
		System.out.println("Vazia = " + lista.isEmpty());
		System.out.println("Tamanho = " + lista.size());
		
		lista.clear();
		
		System.out.println("Tamanho = " + lista.size());
		for (int x = 1; x <= 7; x++) {
			lista.add(x * 2);
		}
		System.out.println("Tamanho = " + lista.size());
		for (int x = 0; x < lista.size(); x++) {
			System.out.println("lista [" + x + "] = " + lista.get(x));
		}
	}
}