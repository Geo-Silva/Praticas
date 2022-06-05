package criador.de.mensagens;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
	
	static ArrayList<String> contatos = new ArrayList<>();
	private static byte opcao;
	private static String nomeUser;
	
	public static void main (String[] args) {
		
		carregarContatos();
		Mensagem.gerarMensagemPadrao();
		Login.fazerMenuLogin();
		
		do {
			
			fazerMenu();
			
			switch(opcao) {
			
			case 0:
				
				JOptionPane.showMessageDialog(null, "Até a próxima!");
				System.exit(opcao);
				
				break;
			
			case 1:
				
				enviarMensagem();
			
				break;
				
			case 2:
				
				adicionarContato();
				
				break;
			
			case 3:
				
				verListaContatos();
				
				break;
				
			case 4:
				
				verInformaçõesContato();
				
				break;
				
			case 5:
				
				personalizarPerfil();
				
				break;
				
			case 6:
				
				mostrarInformacoes();
				
				break;
				
			default:
				
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				
				break;
				
			}

			
		}while(opcao != 0);


	}

	public static void carregarContatos() {
				
		contatos.add("Mãe");
		contatos.add("Pai");
		contatos.add("Leandro Trabalho");
		contatos.add("José");
		contatos.add("Ana");
		contatos.add("Maria");
		contatos.add("Pedrinho");
		
		Contas mae = new Contas();
		mae.setNomeCompleto("Maria Jesus de Fontes");
		mae.setNumero("(48) 98673-1263");
		mae.setLocalizacao("Palhoça, bairro Bela Vista.");
		mae.setEmail("mariajesus@gmail.com");
		mae.setIdade("41");

		Contas pai = new Contas();
		pai.setNomeCompleto("Mário Bragança de Fontes");
		pai.setNumero("(48) 98373-7525");
		pai.setLocalizacao("Palhoça, bairro Bela Vista.");
		pai.setEmail("mariocontato@gmail.com");
		pai.setIdade("50");
		
		Contas leandro = new Contas();
		leandro.setNomeCompleto("Leandro da Silva Constantino");
		leandro.setNumero("(47) 99186-9123");
		leandro.setLocalizacao("Floarianópolis, bairro Estreito.");
		leandro.setEmail("leosilva@gmail.com");
		leandro.setIdade("23");
		
		Contas jose = new Contas();
		jose.setNomeCompleto("Josefino Motta");
		jose.setNumero("(48) 96173-6234");
		jose.setLocalizacao("Floarianópolis, bairro Centro.");
		jose.setEmail("josemotta@gmail.com");
		jose.setIdade("25");
		
		Contas ana = new Contas();
		ana.setNomeCompleto("Ana Budini Freitas");
		ana.setNumero("(41) 97346-8561");
		ana.setLocalizacao("Curitiba, bairro Matriz");
		ana.setEmail("anatrovao@gmail.com");
		ana.setIdade("21");
		
		Contas maria = new Contas();
		maria.setNomeCompleto("Maria Schmitt");
		maria.setNumero("(11) 92735-8456");
		maria.setLocalizacao("São Paulo, bairro Bela Vista");
		maria.setEmail("mariaschmitt@gmail.com");
		maria.setIdade("22");
		
		Contas pedro = new Contas();
		pedro.setNomeCompleto("Pedro Vieira");
		pedro.setNumero("(71) 97136-6254");
		pedro.setLocalizacao("Salvador, bairro Cajazeiras");
		pedro.setEmail("pedrinhopedro@gmail.com");
		pedro.setIdade("27");
		
	}
	
	public static void fazerMenu() {
		
		opcao = Byte.parseByte(JOptionPane.showInputDialog(null,
				"Este é o seu mensageiro! Escolha abaixo o que você deseja fazer"
				+ "\n0 - Sair"
				+ "\n1 - Enviar uma mensagem"
				+ "\n2 - Adicionar um contato"
				+ "\n3 - Ver sua lista de contatos"
				+ "\n4 - Ver informações de algum contato"
				+ "\n5 - Personalizar seu perfil"
				+ "\n6 - Sobre o programa")
				);	
		
	}

	public static void verListaContatos() {
	
		for (String pessoa : contatos) {
			
			JOptionPane.showMessageDialog(null, "Próxima pessoa é: " + pessoa);

		}
	
	}
	
	public static void verInformaçõesContato() {
		
		JOptionPane.showMessageDialog(null, "Esse campo ainda está em desenvolvimento, lembre-se que esse programa é apenas uma beta"
				+ "\nEm futuras versões essa função estará completa e disponível, até lá, fique no aguardo da próxima atualização");
		
	}
	
	public static void adicionarContato() {
		
		String nome, numero, nomeReal, local, mail, idade;
		Contas novaConta = new Contas();
		
		nome = JOptionPane.showInputDialog(null, "Com qual nome você deseja salvar esse contato?");
		contatos.add(nome);
		idade = JOptionPane.showInputDialog(null, "Qual a idade desse contato?");
		novaConta.setIdade(idade);
		numero = JOptionPane.showInputDialog(null,
				"Qual o número desse contato? (Não esqueça de adicionar o DDD e o país de origem, caso seja fora do Brasil)");		
		novaConta.setNumero(numero);
		nomeReal = JOptionPane.showInputDialog(null, "Qual o nome real dessa pessoa? (Opcional)");
		novaConta.setNomeCompleto(nomeReal);
		local = JOptionPane.showInputDialog(null, "Localização atual de seu contato? (Opcional)");
		novaConta.setLocalizacao(local);
		mail = JOptionPane.showInputDialog(null, "Qual o email desse contato? (Opcional)");
		novaConta.setEmail(mail);
		
		JOptionPane.showMessageDialog(null, "Novo contato criado com sucesso!");
		
	}
	
	public static void mostrarInformacoes() {
		
		JOptionPane.showMessageDialog(null, "Some Messenger System, versão 0.37 beta."
				+ "\nCriado por: Geovani da Silva Brustolin"
				+ "\n\"Meu próposito é apenas praticar minha criação de programas, utilizando meus conhecimentos do momento\""
				+ "\nO programa recebe atualizações esporadicamente, todas elas sendo notificadas com antecedência em meu Github"
				+ "\nObrigado por estar testando meu programa e me mande uma mensagem via email em caso de problemas."
				+ "\nContato: rumblycactus3@gmail.com");
		
		
	}
	
	public static void personalizarPerfil() {
		
		String nomeReal, idade, email, local;
		Contas contaIndividual = new Contas();
		
		nomeUser = JOptionPane.showInputDialog(null, "Qual será seu nome de usuário?");
		nomeReal = JOptionPane.showInputDialog(null, "Certo, qual seu nome completo?");
		contaIndividual.setNomeCompleto(nomeReal);
		idade = JOptionPane.showInputDialog(null, "Qual sua idade, " + nomeReal + "?");
		contaIndividual.setIdade(idade);
		email = JOptionPane.showInputDialog(null, "Qual seu endereço de email?");
		contaIndividual.setIdade(email);
		local = JOptionPane.showInputDialog(null, "Onde você mora atualmente?");
		contaIndividual.setLocalizacao(local);
		
		JOptionPane.showMessageDialog(null, "Perfil completamente personalizado! Mais opções em futuras atualizações ;D");
		
	}

	public static void enviarMensagem() {
			
			if(nomeUser == null) {
				
				JOptionPane.showMessageDialog(null,
						"Seu nome de usuário está vazio! Crie seu nome de usuário antes, na aba 'Personalizar Perfil'");
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Esta é uma mensagem padrão, veja como será formatado seu texto.");
				
				JOptionPane.showMessageDialog(null,"-----------------------------\n"
						+ "\t\t\tAssunto: " + Mensagem.mensagemPadrao.getAssunto()
						+ "\n-----------------------------\n"
						+ Mensagem.mensagemPadrao.getMensagem()
						+ "\n-----------------------------\n"
						+ "\t\tPara: " + Mensagem.mensagemPadrao.getDestinatario()
						+ "\n-----------------------------");
				
				Mensagem novaMensagem = new Mensagem();
				
				byte enviar;
				
				novaMensagem.setAssunto(JOptionPane.showInputDialog(null, "Defina o assunto da sua mensagem:"));
				novaMensagem.setMensagem(JOptionPane.showInputDialog(null, "Digite a sua mensagem:"));
				novaMensagem.setDestinatario(JOptionPane.showInputDialog(null, "Defina o seu destinatário (em números)"));
				
				enviar = Byte.parseByte(
						JOptionPane.showInputDialog(null, "Sua mensagem está completa! Enviar?"
								+ "\n0 - Voltar"
								+ "\n1 - Sim")
						);
				
				switch(enviar) {
				
				case 0:
					
					JOptionPane.showMessageDialog(null, "Voltando...");
					
					break;
				
				case 1:
					
					JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso! Confira ela:");
				
					JOptionPane.showMessageDialog(null,"-----------------------------\n"
							+ "\t\t\tAssunto: " + novaMensagem.getAssunto()
							+ "\n-----------------------------\n"
							+ novaMensagem.getMensagem()
							+ "\n-----------------------------\n"
							+ "\t\tPara: " + novaMensagem.getDestinatario()
							+ "\n-----------------------------");
					
					break;
					
				default:
					
					JOptionPane.showMessageDialog(null, "São apenas duas opções poxa...");
					
					break;
				
				}

				
				
			}
		
	}


}
