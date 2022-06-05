package criador.de.mensagens;

public class Mensagem {

	private String assunto;
	private String mensagem;
	private String destinatario;
	public static Mensagem mensagemPadrao = new Mensagem();
	
	public static void gerarMensagemPadrao() {
	
		mensagemPadrao.setAssunto("Este é o assunto padrão, crie uma nova mensagem para altera-la");
		mensagemPadrao.setMensagem("Esta é uma mensagem padrão gerada automaticamente");
		mensagemPadrao.setDestinatario("0000-0000");
		
	}
	
	
	public Mensagem() {
		
		
	}

	public Mensagem(String assunto, String mensagem, String destinatario) {
		super();
		this.assunto = assunto;
		this.mensagem = mensagem;
		this.destinatario = destinatario;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	
}
