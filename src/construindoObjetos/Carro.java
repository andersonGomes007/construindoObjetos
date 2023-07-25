package construindoObjetos;

import java.util.Random;

public class Carro {

	int ano;
	String cor;

	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(10000);
		System.out.println("Chassi: " + chassi);

	}

	public Carro(int ano, String cor) {
		//Random gerador = new Random();
		//int chassi = gerador.nextInt(10000);
		//System.out.println("Chassi: " + chassi);
		this.ano = ano;
		this.cor = cor;
		System.out.println("          ________");
		System.out.println("        /     /    \\");
		System.out.println(" ______/_____/______\\");
		System.out.println("[0[\\\\[0[___  | -  ___|  ");
		System.out.println("\\_____|/, \\|____|/, \\/");
		System.out.println(" \\\\_ \\\\__/     \\\\__/");
		System.out.println("");
		
	}

	void ligar() {
		System.out.println("ENGINE ON ...");
	}

	void desligar() {
		System.out.println("ENGINE OFF ...");

	}

	void acelerar() {
		System.out.println("VRUMMMMMMM ........");

	}
}