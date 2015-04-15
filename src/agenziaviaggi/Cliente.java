package agenziaviaggi;

public class Cliente {
	
	private String nome;
	private String cognome;

	public Cliente(String nome, String cognome) {

		if (nome.length() == 0)
			throw new IllegalArgumentException(
					"l'ID deve avere più di 0 caratteri");
		this.nome = nome;
		
		if (cognome.length() == 0)
			throw new IllegalArgumentException(
					"l'ID deve avere più di 0 caratteri");
		this.cognome = cognome;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCognome() {
		return this.cognome;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome +"]";
	}

}
