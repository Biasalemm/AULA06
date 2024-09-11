package ClasseAbstrata;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro ferrari = new Carro ("00000","F1","Vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("--------------------------------");
		
		Onibus marcopolo = new Onibus ("111111","XB1","Prata",2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
	
		System.out.println("--------------------------------");
		
		Carro porshe = new Carro ("22222","F1","Amarelo",2019);
		porshe.ligar();
		porshe.acelerar();
		porshe.virar();
		porshe.frear();
		
		System.out.println("--------------------------------");
		
		Moto pcx = new Moto ("33333","CG160","Bege e Marrom",2024);
		pcx.ligar();
		pcx.acelerar();
		pcx.virar();
		pcx.frear();
	}

}
