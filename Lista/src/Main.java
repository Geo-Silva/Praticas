import java.util.HashMap;

import javax.swing.JOptionPane;

public class Main {

	static HashMap<Byte, String> lista = new HashMap<>();
	
	public static void main(String[] args) {
		
		lista.put((byte)16, "Comprar rem�dio para queda de cabelo, arrumar a casa, fazer caminhada de tarde");

		byte opcao;
		
		do {
		
		opcao = Byte.parseByte(
			JOptionPane.showInputDialog(null, "Criar uma nova lista (1), ou ver uma? (2)\n(0) para sair")
			);
		
		switch(opcao) {
		
		case 0:
			
			JOptionPane.showMessageDialog(null, "At� a pr�xima!");
			System.exit(opcao);
			
			break;
			
		case 1:
			
			criarLista();
			
			break;
			
		case 2:
			
			verListas();
			
			break;
			
		default:
			
			JOptionPane.showInputDialog(null, "Opc�o inv�lida!");
			
			break;

		}
		
		}while(opcao != 0);
		
	}

	private static void criarLista() {
		
		byte dia;
		String corpo;
		
		dia = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Para qual dia � essa lista?")
				);
		
		if(dia < 0 || dia > 31) {
			
			JOptionPane.showMessageDialog(null, "Dia inv�lido!");
			main(null);
			
		}
		
		corpo = JOptionPane.showInputDialog(null, "Digite sua lista de itens aqui");
		
		lista.put(dia, corpo);
		
	}

	private static void verListas() {

		JOptionPane.showMessageDialog(null, lista);
		
	}

}
