package fazendo.fibonacci;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao = 1;

		do {

			switch (fazerMenu(opcao)) {

			case 0:

				System.out.println("Saindo...");
				System.exit(opcao);

				break;

			case 1:

				fazerFibonnaci();

				break;

			default:

				System.out.println("Opção inválida!");

				break;

			}

		} while (opcao != 0);

	}

	public static byte fazerMenu(byte opcao) {

		System.out.println("Bem vindo ao menu de opções, escolha o que você deseja fazer" + "\n0 - Sair"
				+ "\n1 - Sequência de Fibonacci");
		opcao = entrada.nextByte();

		return opcao;

	}

	public static void fazerFibonnaci() {

		float numeroA, numeroB, resultado;
		numeroA = 1;
		numeroB = 0;
		int numeroC, numeroD, opcaoUm;
		numeroC = 1;
		numeroD = 0;
		byte opcao;

		System.out.println("Você deseja:" + "\n1 - Escolher até qual número da sequência deve-se ir"
				+ "\n2 - Ver os 10 primeiros valores da sequência");
		opcao = entrada.nextByte();

		switch (opcao) {

		case 1:

			System.out.println("Escolha um número para ver todos da sequência até esse número.");
			opcaoUm = entrada.nextInt();

			for (int count = 0; count <= opcaoUm; count++) {

				resultado = numeroA + numeroB;
				System.out.println(numeroA + " + " + numeroB + " = " + resultado);
				numeroB = numeroA;
				numeroA = resultado;

			}

			break;

		case 2:

			for (int count = 1; count <= 10; count++) {

				resultado = numeroC + numeroD;
				System.out.println(numeroC + " + " + numeroD + " = " + resultado);
				numeroD = numeroC;
				numeroC = (int) resultado;

			}

		default:

			System.out.println("Opção inválida!");
			fazerFibonnaci();

			break;

		}

	}

}
