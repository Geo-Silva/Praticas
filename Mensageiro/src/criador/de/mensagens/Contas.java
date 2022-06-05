package criador.de.mensagens;

public class Contas {

	private String nomeCompleto;
	private String email;
	private String localizacao;
	private String numero;
	private String idade;
	
	public Contas() {
		
		
	}

	public Contas(String nomeCompleto, String email, String localizacao, String numero, String idade) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.localizacao = localizacao;
		this.numero = numero;
		this.idade = idade;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	

}
