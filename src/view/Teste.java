package view;

import java.util.Scanner;

import model.Dinosauro;

public class Teste {

	public static void main(String[] args) {

		Dinosauro skeep = new Dinosauro();
		Scanner scan = new Scanner(System.in);
		String textoMaiusculo;
		char letra;

		System.err.println(skeep + "\n\n");

		while (true) {

			System.out.println("opções:\n" + "*(P)ular *(C)orrer *Co(M)er *(A)tirar *Tomar (S)ol *Ficar na S(O)mbra");
			textoMaiusculo = scan.nextLine().toUpperCase();
			
			if (!textoMaiusculo.equalsIgnoreCase("")) {
				letra = textoMaiusculo.charAt(0);

				switch (letra) {
				case 'P':
					skeep.pular();
					break;
				case 'C':
					skeep.correr();
					break;
				case 'A':
					skeep.atirar();
					break;
				case 'S':
					skeep.tomarSol();
					break;
				case 'O':
					skeep.ficaNaSombra();
					break;
				case 'M':
					skeep.comer();
					break;

				default:System.out.println("Opição invalida");
					break;
				}

				System.err.println("\n\n" + skeep + "\n\n");
			} else {
				System.out.println("Digite uma opição");
			}

		}

	}

}
