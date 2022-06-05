package criador.de.mensagens;

import javax.swing.JOptionPane;

public class Login extends Contas {

	private static String user;
	private static String pass;
	private static String userUm = "";
	private static String passUm = "";
	
	public static void fazerMenuLogin() {
		
		byte opcao;
		
		opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Você deseja fazer seu login ou cadastro?"
						+ "\nSe esta é sua primeira vez no programa, faça seu cadastro."
						+ "\n0 - Sair"
						+ "\n1 - Login"
						+ "\n2 - Cadastro")
				);
	
		switch(opcao) {
		
		case 0:
			
			System.exit(opcao);
			
			break;
			
		case 1:
			
			Logar();
			
			break;
			
		case 2:
			
			Cadastrar();
			
			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		
			break;
			
		}
		
	}
	
	private static void Logar() {
		
		user = JOptionPane.showInputDialog(null, "Usuário:");
		pass = JOptionPane.showInputDialog(null, "Senha:");
		
		if(user.equals(userUm) && pass.equals(passUm)) {
			
			JOptionPane.showMessageDialog(null, "Bem vindo, " + user);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Credenciais incorretas, tente novamente.");
			fazerMenuLogin();
			
		}
		
	}

	private static void Cadastrar() {
		
		userUm = JOptionPane.showInputDialog(null, "Qual seu nome de usuário?");
		passUm = JOptionPane.showInputDialog(null, "Crie sua senha:");
		
		JOptionPane.showMessageDialog(null, "Cadastro completo! Siga agora para o login!");
		fazerMenuLogin();
		
	}
	
	public Login() {
		
		
		
	}

	public Login(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;

	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}	