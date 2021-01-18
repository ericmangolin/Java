package pos;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.io.FileWriter;

public class Estudo_de_Caso {
public static void main(String[] args) {
if (args.length == 0) {
System.err.println("Informar o arquivo XML: /" + "java Estudo_de_Caso <nome_pessoas.xml>");
System.exit(1);
}

// O handler implementa a construção do modelo de objetos, convertendo o documento XML em um objeto Pessoas o qual contém o registro de nomes
XML_SAX_handler handler = new XML_SAX_handler();
try {
	XMLReader parser = XMLReaderFactory.createXMLReader();
	parser.setContentHandler(handler);
	parser.parse(args[0]);
	System.out.println("O modelo de objetos foi criado com sucesso.\n");
}
catch (SAXException e) {
	System.out.println(args[0] + " não é um documento XML bem formado.");
	System.exit(1);
}
catch (IOException e) {
	System.out.println("Problema para carregar o arquivo " + args[0]);
	System.exit(1);
}

// Agora o documento XML está em memória, no modelo de objetos. A classe Pessoas representa o registro de nomes
Pessoas registro = handler.getRegistroNomes();
registro.imprimeRegistro();
// Vamos fazer as alterações desejadas imprimindo seus resultados

// INCLUINDO UM NOVO NOME DE PESSOA
registro.insereNome("Eric", "Andre", "Mangolim");
registro.imprimeRegistro();

// ALTERA UM NOME, REMOVENDO O ATUAL E INSERINDO UM NOVO
Nome alterar = registro.buscaPorPrimeiroNome("Luiz");
if (alterar != null)
registro.alteraNome(alterar, new Nome("Julio", "Pereira", "Julinho"));
registro.imprimeRegistro();

// REMOVE TODOS NOMES DE PESSOAS QUE NÂO TÊM APELIDO
Nome remover = registro.buscaPorApelido("");
while (remover != null) {
registro.removeNome(remover);
remover = registro.buscaPorApelido("");
}
// Finalmente, vamos transformar o registro novamente em XML e salvar em disco as alterações feitas
salvaEmArquivo(registro.toXML(), "registro_de_nomes.xml");
}

	public static void salvaEmArquivo(String documento, String nomeArquivo) {
		try {
			FileWriter fOut = new FileWriter(nomeArquivo);
			fOut.write(documento);
			fOut.flush();
			System.out.println("\nO documento XML editado foi salvo no arquivo " + nomeArquivo);
		} catch (Exception e) {
			System.err.print("Problema na criação do arquivo XML.");
			e.printStackTrace();
			System.exit(1);
		}
	}
} // Fim da classe Estudo_de_Caso