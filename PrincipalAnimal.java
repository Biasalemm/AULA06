package ClasseAbstrata;

public class PrincipalAnimal {
	public static void main(String[] args) {
		
	    Lobo lobo = new Lobo("Max","Masculino","lobo cinzento (Canis lupus)");
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		lobo.emitirSom();
		
		System.out.println("--------------------------------");
		
		Leao leao = new Leao ("Lupus","Feminino","leão-africano");
		leao.caminhar();
		leao.correr();
		leao.dormir();
		leao.emitirSom();
		
		System.out.println("--------------------------------");
	
		Tigre tigre = new Tigre ("Luna","Feminino","Tigre-siberiano");
		tigre.caminhar();
		tigre.correr();
		tigre.dormir();
		tigre.emitirSom();
		
		System.out.println("--------------------------------");
		
		Cachorro cachorro = new Cachorro("Pandora","Feminino","Pastor-alemão");
		cachorro.caminhar();
		cachorro.correr();
		cachorro.dormir();
		cachorro.emitirSom();
		
		System.out.println("--------------------------------");
		
		Gato gato = new Gato ("Floquinho","Masculino","Siamês");
		gato.caminhar();
		gato.correr();
		gato.dormir();
		gato.emitirSom();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
