
public class ClienteNovo implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public ClienteNovo() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
