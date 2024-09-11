package ClasseAbstrata;

public class Lobo extends Animal {

	public Lobo (String nome, String sexo, String raça) {
		super (nome,sexo,raça);
	}
	@Override
	 public void dormir() {
		 System.out.println("O lobo está dormindo");
	 }
	 @Override
	 public void caminhar() {
		 System.out.println("O lobo está caminhando");
	 }
	 @Override
	 public void correr() {
		 System.out.println("O lobo está correndo");
	 }
	 @Override
	 public void emitirSom() {
		 System.out.println("O lobo está uivando");
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
