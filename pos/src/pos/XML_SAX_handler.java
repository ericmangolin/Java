package pos;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

public class XML_SAX_handler extends DefaultHandler {
	Pessoas registro = new Pessoas();
	Nome nome;
	String elementoAtual;

	public XML_SAX_handler() {
	}

	public Pessoas getRegistroNomes() {
		return this.registro;
	}

	public void startElement(String uri, String localName, String qName, Attributes atts) {
		if (qName.equalsIgnoreCase("primeiro")) {
			this.elementoAtual = "primeiro";
		} else if (qName.equalsIgnoreCase("sobrenome")) {
			this.elementoAtual = "sobrenome";
		} else if (qName.equalsIgnoreCase("apelido")) {
			this.elementoAtual = "apelido";
		} else if (qName.equalsIgnoreCase("nome")) {
			this.nome = new Nome();
		}
	}

	public void characters(char ch[], int start, int length) {
// Toma-se cuidado em se manter dentro dos limites
		String valor = new String(ch, start, length);
		if (!valor.trim().equals("")) {
			if (elementoAtual.equalsIgnoreCase("primeiro")) {
				this.nome.setPrimeiroNome(valor);
			} else if (elementoAtual.equalsIgnoreCase("sobrenome")) {
				this.nome.setSobrenome(valor);
			} else if (elementoAtual.equalsIgnoreCase("apelido")) {
				this.nome.setApelido(valor);
			}
		}
	}

	public void endElement(String uri, String localName, String qName) {
		if (qName.equalsIgnoreCase("nome")) {
			registro.insereNome(this.nome);
			this.nome = null;
		}
	}
} // Fim da classe XML_SAX_handler