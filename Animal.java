package ClasseAbstrata;

public abstract class Animal {
	
	private String nome;
	private String sexo;
	private String raça;
	
	public Animal(String nome, String sexo, String raça){
		this.nome = nome;
		this.sexo = sexo;
		this.raça= raça;
	}
	
		//Gerar Getters e Setters
		
		public abstract void dormir();
		
		public abstract void caminhar();
		
		public abstract void correr();
		
		public abstract void emitirSom();
	
	
	
	
	
	
}
