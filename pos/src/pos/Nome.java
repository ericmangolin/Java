package pos;

public class Nome {
	String primeiro, sobrenome, apelido;

	// construtores da classe Nome
	public Nome() {
		primeiro = "";
		sobrenome = "";
		apelido = "";
	}

	public Nome(String primeiro, String sobrenome, String apelido) {
		this.primeiro = primeiro;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
	}

	// SETTERS
	public void setPrimeiroNome(String nome) {
		this.primeiro = nome;
	}

	public void setSobrenome(String nome) {
		this.sobrenome = nome;
	}

	public void setApelido(String nome) {
		this.apelido = nome;
	}

	// GETTERS
	public String getPrimeiroNome() {
		return this.primeiro;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public String getApelido() {
		return this.apelido;
	}
}
