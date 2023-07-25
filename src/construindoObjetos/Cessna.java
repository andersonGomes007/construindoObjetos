package construindoObjetos;

public class Cessna {

	public static void main(String[] args) {
		Aviao cessna = new Aviao();
		
		cessna.ano = 2018;
		cessna.cor = "Preto";
		cessna.envergadura = 12;
		System.out.println("Aviao: Cessna ");
		System.out.println("Ano: " + cessna.ano);
		System.out.println("Cor: " + cessna.cor);
		System.out.println("Envergadura: " + cessna.envergadura + " M ");
		cessna.ligar();
		cessna.acelerar();
	}

}
