package ClasseAbstrata;

public class Gato extends Animal{
	public Gato (String nome, String sexo, String raça) {
		super (nome,sexo,raça);
	}
	@Override
	 public void dormir() {
		 System.out.println("O Gato está dormindo");
	 }
	 @Override
	 public void caminhar() {
		 System.out.println("O Gato está caminhando");
	 }
	 @Override
	 public void correr() {
		 System.out.println("O Gato está correndo");
	 }
	 @Override
	 public void emitirSom() {
		 System.out.println("O Gato está miando");
	 }
}
