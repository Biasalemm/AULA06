package ClasseAbstrata;

public class Tigre extends Animal{
	public Tigre (String nome, String sexo, String raça) {
		super (nome,sexo,raça);
	}
	@Override
	 public void dormir() {
		 System.out.println("O Tigre está dormindo");
	 }
	 @Override
	 public void caminhar() {
		 System.out.println("O Tigre está caminhando");
	 }
	 @Override
	 public void correr() {
		 System.out.println("O Tigre está correndo");
	 }
	 @Override
	 public void emitirSom() {
		 System.out.println("O Tigre está rugindo");
	 }
	
}
