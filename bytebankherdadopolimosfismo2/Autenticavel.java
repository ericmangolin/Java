//Contrato
	//quem assinar precisa implementar os m�todos. Ex.:
		//SetSenha
		//Autentica

public abstract interface Autenticavel {
		
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
					
}
