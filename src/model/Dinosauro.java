/*
  
 - O dinossauro precisa tomar Sol para ter velocidade, além de deixa-lo
   com o humor feliz
 - Precisa comer para ter energia, e comer deixa o humor feliz
 - Para cada ponto de velocidade ganho ele perde um ponto de energia
 - Correr gasta energia deixa o humor feliz
 - ficarNaSombra recupera energia deixa o humor triste
 - atirar gasta energia e deixa o humor feliz
 - pular gasta energia e deixa o humor feliz
 */

package model;

public class Dinosauro {
	private int energia;
	private int velocidade;
	private int temperatura;
	private boolean humor;

	public Dinosauro() {

		this.energia = 0;
		this.velocidade = 0;
		this.temperatura = 0;
		this.humor = false;

	}

	public void pular() {

		if (energia > 0) {

			System.out.println("Dinosauro esta atirando");
			energia--;
			this.humor = true;

		} else {
			System.out.println("A energia esta muito baixa, precisa comer");
		}

	}

	public void correr() {

		if (energia > 0) {

			if (velocidade > 0) {

				System.out.println("Dinosauro esta correndo");
				energia--;
				this.humor = true;

			} else {
				System.out.println("A velocidade esta muito baixa, precisa ficar no sol");
			}
		} else {
			System.out.println("A energia esta muito baixa, precisa comer");
		}
	}

	public void comer() {

		if (energia < 10) {
			System.out.println("Dinosauro estaa comendo");
			this.energia++;
			this.humor = true;
		} else {
			System.out.println("Energia no Maximo");
		}

	}

	public void atirar() {

		if (energia > 0) {

			System.out.println("Dinosauro esta atirando");
			energia--;
			this.humor = true;

		} else {
			System.out.println("A energia esta muito baixa, precisa comer");
		}

	}

	public void tomarSol() {

		if (energia > 0) {
			if (velocidade < 10) {

				System.out.println("Dinosauro esta no Sol");
				this.velocidade++;
				this.energia--;
				this.humor = true;
			} else {
				System.out.println("Velocidade no Maximo");
			}
		} else {
			System.out.println("A energia esta muito baixa, precisa comer");
		}
	}

	public void ficaNaSombra() {

		System.out.println("Dinosauro esta na sombra");

		if (energia < 10) {

			this.energia++;
			this.humor = false;

		}

	}

	@Override
	public String toString() {
		String humorSaida;
		if (humor) {
			humorSaida = "Feliz";
		} else {
			humorSaida = "Triste";
		}

		return "Dinosauro [energia=" + energia + ", velocidade=" + velocidade + ", temperatura=" + temperatura
				+ ", humor=" + humorSaida + "]";
	}

}
