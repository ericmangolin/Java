package pos;

import java.util.Vector;

public class Pessoas {
	Vector<Nome> registro;

	public Pessoas() {
		registro = new Vector();
	}

	public void insereNome(Nome nome) {
		registro.add(nome);
	}

	public void insereNome(String primeiro, String sobrenome, String apelido) {
		registro.add(new Nome(primeiro, sobrenome, apelido));
	}

public void removeNome(Nome nome){
if (!registro.remove(nome))
System.out.println("removeNome(Nome nome): Nome não existente.");
}

public void removeNome(String primeiro, String sobrenome,
String apelido){
Nome nome = new Nome(primeiro, sobrenome, apelido);
boolean encontrado = registro.remove(nome);
if (!encontrado)
System.out.println("removeNome(String primeiro, String sobrenome, String apelido): Nome não existente.");
}

public void alteraNome(Nome atual, Nome novo){
int posicao = registro.indexOf(atual);
if (posicao >= 0) {
registro.remove(posicao);
registro.add(posicao, novo);
} else
System.out.println("alteraNome(Nome atual, Nome novo): Nome atual não existente.");
}

// Retorna o primeiro objeto Nome do registro de Pessoas, cujo primeiro nome é igual a String primeiro
	public Nome buscaPorPrimeiroNome(String primeiro) {
		for (int i = 0; i < registro.size(); i++) {
			Nome nome = registro.elementAt(i);
			if (primeiro.equalsIgnoreCase(nome.getPrimeiroNome()))
				return nome;
		}
		return null;
	}

// Retorna o primeiro objeto Nome do registro de Pessoas, cujo apelido é igual a String apelido
	public Nome buscaPorApelido(String apelido) {
		for (int i = 0; i < registro.size(); i++) {
			Nome nome = registro.elementAt(i);
			if (apelido.equalsIgnoreCase(nome.getApelido()))
				return nome;
		}
		return null;
	}

	public void imprimeRegistro() {
		System.out.println("\nREGISTRO DE PESSOAS");
		System.out.println("===================");
		for (int i = 0; i < registro.size(); i++) {
			Nome nome = registro.elementAt(i);
			System.out.println();
			System.out.println("Primeiro nome: " + nome.getPrimeiroNome());
			System.out.println("Sobrenome: " + nome.getSobrenome());
			System.out.println("Apelido: " + nome.getApelido());
		}
	}

	public String toXML() {
		String xml = "<?xml version=\"1.0\" enconding=\"UTF-8\"?>";
		xml += "\n<pessoas>";
		for (int i = 0; i < registro.size(); i++) {
			Nome nome = registro.elementAt(i);
			xml += "\n<nome>";
			String valor = nome.getPrimeiroNome();
			if (!valor.equals(""))
				xml += "\n <primeiro>" + valor + "</primeiro>";
			valor = nome.getSobrenome();
			if (!valor.equals(""))
				xml += "\n <sobrenome>" + valor + "</sobrenome>";
			valor = nome.getApelido();
			if (!valor.equals(""))
				xml += "\n <apelido>" + valor + "</apelido>";
			xml += "\n</nome>";
		}
		xml += "\n</pessoas>";
		return xml;
	}
} // Fim da classe Pessoas